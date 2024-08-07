package nandi.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record PaymentMethods(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		PaymentType tipoPagamento,
		String detalhes,
		Users user) {

}
