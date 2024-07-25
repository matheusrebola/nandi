package nandi.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nandi.entities.PaymentMethods;

@Repository
public interface PaymentMethodsRepository extends JpaRepository<PaymentMethods, UUID> {

}
