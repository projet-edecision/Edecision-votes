package fr.clam.edecision;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface voteRepository extends CrudRepository<voteEntity, UUID> {

    List<voteEntity> findByUuidProposition(UUID uuidProposition);

    List<voteEntity> findByUuidMembre(UUID uuidMembre);

    List<voteEntity> findByUuidPropositionAndUuidMembre(UUID uuidProposition, UUID uuidMembre);

}
