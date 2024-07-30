package nandi.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record UsersDto(
		@NotNull UUID id,
		String nome,
		String email,
		String senha,
		LocalDateTime dataCriacao,
		LocalDateTime dataAtualizacao) {

}
