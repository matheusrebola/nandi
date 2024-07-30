package nandi.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import nandi.entities.Campaigns;

public record CampaignsUpdatesDto(
		@NotNull UUID id,
		String titulo,
		String conteudo,
		LocalDateTime dataCriacao,
		Campaigns campaign) {

}
