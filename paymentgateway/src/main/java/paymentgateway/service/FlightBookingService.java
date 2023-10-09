package paymentgateway.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import paymentgateway.dto.FlightBookingAcknowledgement;
import paymentgateway.dto.FlightBookingRequest;
import paymentgateway.entity.PassengerInfo;
import paymentgateway.entity.PaymentInfo;
import paymentgateway.repository.PassengerInfoRepository;
import paymentgateway.repository.PaymentInfoRepository;
import paymentgateway.utils.PaymentUtils;

@Service
public class FlightBookingService {
	
	@Autowired
	private PassengerInfoRepository passengerInfoRepository;
	
	@Autowired
	private PaymentInfoRepository paymentInfoRepository;
	
	@Transactional//(readOnly = false , isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
	public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest flightBookingRequest) {
		
		
		PassengerInfo passengerInfo =  flightBookingRequest.getPassengerInfo();
		
		 passengerInfo = passengerInfoRepository.save(passengerInfo);
		
		PaymentInfo paymentInfo = flightBookingRequest.getPaymentInfo();
		
		PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());
		
		paymentInfo.setAmount(passengerInfo.getFare());
		paymentInfo.setPassengerId(passengerInfo.getPId());
		paymentInfoRepository.save(paymentInfo);
		
		return new FlightBookingAcknowledgement("success", passengerInfo.getFare(),UUID.randomUUID().toString().split("-")[0],passengerInfo);
		
	}

}
