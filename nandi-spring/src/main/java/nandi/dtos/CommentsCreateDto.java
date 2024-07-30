package nandi.dtos;

import java.time.LocalDateTime;

import nandi.entities.Campaigns;
import nandi.entities.Users;

public record CommentsCreateDto(
		String conteudo,
		LocalDateTime dataCriacao,
		Campaigns campaign,
		Users user) {

}
