package br.org.cowdfounding.nandi.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record CampaignShares(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		RedeSocial redeSocial,
		LocalDateTime dataCompartilhamento,
		Users user,
		Campaigns campaign) {

}
