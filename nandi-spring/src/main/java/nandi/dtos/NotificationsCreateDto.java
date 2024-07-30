package nandi.dtos;

import java.time.LocalDateTime;

import nandi.entities.Users;

public record NotificationsCreateDto(
		String mensagem,
		Boolean lida,
		LocalDateTime dataCriacao,
		Users user) {

}
