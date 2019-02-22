package com.creative.stockmanager.entity;


import java.util.Date;
import java.util.Objects;

public class TacheBuilder {


    private String titre;
    private String description;
    private Date deadLine;
    private Integer numTache;

    public TacheBuilder setNumTache(Integer numTache) {
        this.numTache = numTache;
        return this;
    }
    public TacheBuilder setTitre(String titre) {
        this.titre = titre;
        return this;
    }

    public TacheBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public TacheBuilder setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
        return this;
    }

    public Tache build(){
        Objects.requireNonNull(numTache);
        Objects.requireNonNull(titre);
        Tache tache = new Tache();
        tache.setNumTache(numTache);
        tache.setDeadLine(deadLine);
        tache.setDescription(description);
        tache.setTitre(titre);

        return tache;
    }
}
