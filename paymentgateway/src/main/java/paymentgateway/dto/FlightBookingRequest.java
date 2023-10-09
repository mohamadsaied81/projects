package paymentgateway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import paymentgateway.entity.PassengerInfo;
import paymentgateway.entity.PaymentInfo;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {

	private PassengerInfo passengerInfo;
	
	private PaymentInfo paymentInfo;
}
