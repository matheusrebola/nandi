package nandi.dtos;

import java.time.LocalDateTime;

import nandi.entities.Campaigns;
import nandi.entities.SocialNetwork;
import nandi.entities.Users;

public record CampaignsSharesCreateDto(
		SocialNetwork redeSocial,
		LocalDateTime dataCompartilhamento,
		Users user,
		Campaigns campaign) {

}
