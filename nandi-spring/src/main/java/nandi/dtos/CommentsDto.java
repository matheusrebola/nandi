package nandi.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import nandi.entities.Campaigns;
import nandi.entities.Users;

public record CommentsDto(
		@NotNull UUID id,
		String conteudo,
		LocalDateTime dataCriacao,
		Campaigns campaign,
		Users user) {

}
