package nandi.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record CategoriesDto(
		@NotNull UUID id,
		String nome,
		String descricao) {

}
