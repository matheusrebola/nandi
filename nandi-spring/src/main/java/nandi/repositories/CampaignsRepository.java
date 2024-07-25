package nandi.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nandi.entities.Campaigns;

@Repository
public interface CampaignsRepository extends JpaRepository<Campaigns, UUID> {

}
