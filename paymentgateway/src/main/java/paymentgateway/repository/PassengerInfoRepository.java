package paymentgateway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import paymentgateway.entity.PassengerInfo;

@Repository
public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, Long> {

}
