package nandi.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nandi.entities.Notifications;

@Repository
public interface NotificationsRepository extends JpaRepository<Notifications, UUID> {

}
