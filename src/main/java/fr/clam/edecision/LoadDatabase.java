package fr.clam.edecision;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.UUID;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(voteRepository repository) {

        UUID uuid1 = UUID.randomUUID();
        UUID uuid2 = UUID.randomUUID();
        UUID uuid3 = UUID.randomUUID();
        UUID uuid4 = UUID.randomUUID();

        voteEntity vote1 = new voteEntity(uuid1, uuid2, 1);
        voteEntity vote2 = new voteEntity(uuid3, uuid4, 0);

        return args -> {
            log.info("Preloading " + repository.save(vote1));
            log.info("Preloading " + repository.save(vote2));
        };
    }

}
