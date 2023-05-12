package fr.clam.edecision;

import java.util.UUID;

public class voteNotFoundException extends RuntimeException {
    voteNotFoundException(UUID id) {
        super("Could not find employee " + id.toString());
    }

}
