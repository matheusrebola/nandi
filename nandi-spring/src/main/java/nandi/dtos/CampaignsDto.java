package nandi.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import nandi.entities.Category;
import nandi.entities.Users;

public record CampaignsDto(
		@NotNull UUID id,
		String titulo,
		String descricao,
		BigDecimal metaFinanceira,
		LocalDateTime prazo,
		Category categoria,
		LocalDateTime dataCriacao,
		LocalDateTime dataAtualizacao,
		Users user) {

}
