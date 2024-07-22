package nandi.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Contributions(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		BigDecimal valor,
		LocalDateTime dataContribuicao,
		Campaigns campaign,
		Users user) {

}
