package br.org.cowdfounding.nandi.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Campaigns(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String titulo,
		String descricao,
		BigDecimal metaFinanceira,
		LocalDateTime prazo,
		Categoria categoria,
		LocalDateTime dataCriacao,
		LocalDateTime dataAtualizacao,
		Users user) {

}
