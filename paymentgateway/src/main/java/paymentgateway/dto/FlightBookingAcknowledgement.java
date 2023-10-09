package paymentgateway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import paymentgateway.entity.PassengerInfo;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAcknowledgement {
	
	private String status;
	private double totalFare;
	private String pnrNo;
	
	private PassengerInfo passengerInfo;
}
