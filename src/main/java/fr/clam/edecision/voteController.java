package fr.clam.edecision;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class voteController {

    private final voteRepository repository;

    public voteController(voteRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/votes")
    List<voteEntity> allVotes() {
        return (List<voteEntity>) repository.findAll();
    }

    @PostMapping("/vote")
    voteEntity newVote(@RequestBody voteEntity newVote) {
        return repository.save(newVote);
    }

    @GetMapping("/membreListVotes/{uuidMembre}")
    List<voteEntity> allMembreListVotes(@PathVariable("uuidMembre") UUID uuidMembre) {
        return repository.findByUuidMembre(uuidMembre);
    }

    @GetMapping("/propositionListVotes/{uuidProposition}")
    List<voteEntity> allPropositionListVotes(@PathVariable("uuidProposition") UUID uuidProposition) {
        return repository.findByUuidProposition(uuidProposition);
    }

    @GetMapping("/voteByPropositionAndMembre/{uuidProposition}&{uuidMembre}")
    List<voteEntity> allPropositionListVotes(@PathVariable("uuidProposition") UUID uuidProposition, @PathVariable("uuidMembre") UUID uuidMembre) {
        return repository.findByUuidPropositionAndUuidMembre(uuidProposition, uuidMembre);
    }

}
