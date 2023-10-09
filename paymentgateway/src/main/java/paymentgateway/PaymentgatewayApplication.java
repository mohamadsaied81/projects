package paymentgateway;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import paymentgateway.dto.FlightBookingAcknowledgement;
import paymentgateway.dto.FlightBookingRequest;
import paymentgateway.service.FlightBookingService;

@SpringBootApplication
@RestController
@EnableTransactionManagement
public class PaymentgatewayApplication {
	private static final Logger logger = LogManager.getLogger(PaymentgatewayApplication.class);

	@Autowired//declared whether dependency 
	private FlightBookingService flightBookingService;
	
	@PostMapping("/bookFlightTicket")
	public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest flightBookingRequest) {
		logger.trace("Flightbooking in service: {} ", flightBookingService.bookFlightTicket(flightBookingRequest));
		return flightBookingService.bookFlightTicket(flightBookingRequest);
	}
	public static void main(String[] args) {
		SpringApplication.run(PaymentgatewayApplication.class, args);
	}

}
