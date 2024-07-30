package nandi.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import nandi.entities.PaymentType;
import nandi.entities.Users;

public record PaymentMethodsDto(
		@NotNull UUID id,
		PaymentType tipoPagamento,
		String detalhes,
		Users user) {

}
