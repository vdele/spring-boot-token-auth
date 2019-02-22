package com.creative.stockmanager.entity;

import java.util.Date;

public class Tache {

    private Integer numTache;
    private String titre;
    private String description;
    private Date deadLine;

    protected Tache(){

    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public Integer getNumTache() {
        return numTache;
    }

    public void setNumTache(Integer numTache) {
        this.numTache = numTache;
    }
}
