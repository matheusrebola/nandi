package nandi.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import nandi.entities.Campaigns;
import nandi.entities.Users;

public record ContributionsCreateDto(
		BigDecimal valor,
		LocalDateTime dataContribuicao,
		Campaigns campaign,
		Users user) {

}
