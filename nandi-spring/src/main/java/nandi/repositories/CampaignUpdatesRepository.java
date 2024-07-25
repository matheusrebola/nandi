package nandi.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nandi.entities.CampaignUpdates;

@Repository
public interface CampaignUpdatesRepository extends JpaRepository<CampaignUpdates, UUID> {

}
