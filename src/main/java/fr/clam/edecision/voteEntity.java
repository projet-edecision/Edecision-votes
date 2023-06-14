package fr.clam.edecision;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.UUID;
import java.io.Serializable;

@Entity
@Table(name = "votes")
public class voteEntity implements Serializable {

    @Id
    private UUID uuid;
    private UUID uuidMembre;
    private UUID uuidProposition;
    private Number vote;

    public voteEntity(){ this.uuid = UUID.randomUUID(); }

    public voteEntity(UUID uuidMembre, UUID uuidProposition, Number vote){
        this.uuid = UUID.randomUUID();
        this.uuidMembre = uuidMembre;
        this.uuidProposition = uuidProposition;
        this.vote = vote;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuidMembre() {
        return uuidMembre;
    }

    public void setUuidMembre(UUID uuidMembre) {
        this.uuidMembre = uuidMembre;
    }

    public UUID getUuidProposition() {
        return uuidProposition;
    }

    public void setUuidProposition(UUID uuidProposition) {
        this.uuidProposition = uuidProposition;
    }

    public Number getVote() {
        return vote;
    }

    public void setVote(Number vote) {
        this.vote = vote;
    }
}
