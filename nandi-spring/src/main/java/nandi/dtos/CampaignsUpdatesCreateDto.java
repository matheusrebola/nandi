package nandi.dtos;

import java.time.LocalDateTime;

import nandi.entities.Campaigns;

public record CampaignsUpdatesCreateDto(
		String titulo,
		String conteudo,
		LocalDateTime dataCriacao,
		Campaigns campaign) {

}
