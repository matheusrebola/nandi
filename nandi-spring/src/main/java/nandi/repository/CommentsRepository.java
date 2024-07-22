package nandi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nandi.entities.Comments;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, UUID> {

}
