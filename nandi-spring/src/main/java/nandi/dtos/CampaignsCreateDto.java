package nandi.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import nandi.entities.Category;
import nandi.entities.Users;

public record CampaignsCreateDto(
		String titulo,
		String descricao,
		BigDecimal metaFinanceira,
		LocalDateTime prazo,
		Category categoria,
		LocalDateTime dataCriacao,
		LocalDateTime dataAtualizacao,
		Users user) {

}
