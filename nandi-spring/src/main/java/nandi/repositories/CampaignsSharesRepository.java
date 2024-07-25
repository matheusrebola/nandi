package nandi.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nandi.entities.CampaignShares;

@Repository
public interface CampaignsSharesRepository extends JpaRepository<CampaignShares, UUID> {

}
