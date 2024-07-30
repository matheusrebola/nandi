package nandi.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import nandi.entities.Users;

public record NotificationsDto(
		@NotNull UUID id,
		String mensagem,
		Boolean lida,
		LocalDateTime dataCriacao,
		Users user) {

}
