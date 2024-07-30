package nandi.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import nandi.entities.Campaigns;
import nandi.entities.Users;

public record ContributionsDto(
		@NotNull UUID id,
		BigDecimal valor,
		LocalDateTime dataContribuicao,
		Campaigns campaign,
		Users user) {

}
