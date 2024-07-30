package nandi.dtos;

import java.time.LocalDateTime;

public record UsersCreateDto(
		String nome,
		String email,
		String senha,
		LocalDateTime dataCriacao,
		LocalDateTime dataAtualizacao) {

}
