package nandi.dtos;

import nandi.entities.PaymentType;
import nandi.entities.Users;

public record PaymentMethodsCreateDto(
		PaymentType tipoPagamento,
		String detalhes,
		Users user) {

}
