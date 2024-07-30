package nandi.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import nandi.entities.Campaigns;
import nandi.entities.SocialNetwork;
import nandi.entities.Users;

public record CampaignsSharesDto(
		@NotNull UUID id,
		SocialNetwork redeSocial,
		LocalDateTime dataCompartilhamento,
		Users user,
		Campaigns campaign) {

}
