package com.creative.stockmanager.repository;

import com.creative.stockmanager.entity.TacheBuilder;
import com.creative.stockmanager.entity.Tache;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public class TacheRepository {

    private static final Map<Integer, Tache> tacheMap = new HashMap<>();

    static {
        initTaches();
    }

    private static void initTaches() {
        Tache t1 = new TacheBuilder()
                .setNumTache(1)
                .setDeadLine(new Date())
                .setTitre("Eplucher les pommes de terre")
                .setDescription("Prendre un excellent économe et éplucher les pommes de terres")
                .build();
        Tache t2 = new TacheBuilder()
                .setNumTache(2)
                .setDeadLine(new Date())
                .setTitre("Couper les pommes de terre")
                .setDescription("Prendre un excellent couteau et couper les pommes de terres en petits cubes égaux")
                .build();
        Tache t3 = new TacheBuilder()
                .setNumTache(3)
                .setDeadLine(new Date())
                .setTitre("Cuire les pommes de terre")
                .setDescription("Prendre un excellent économe et éplucher les pommes de terres")
                .build();

        tacheMap.put(t1.getNumTache(), t1);
        tacheMap.put(t2.getNumTache(), t2);
        tacheMap.put(t3.getNumTache(), t3);
    }

    public Tache getTache(Integer numTache) {
        return tacheMap.get(numTache);
    }

    public Tache addTache(Tache tache) {
        tacheMap.put(tache.getNumTache(), tache);
        return tache;
    }

    public Tache updateTache(Tache tache) {
        tacheMap.put(tache.getNumTache(), tache);
        return tache;
    }

    public void deleteTache(Integer numTache) {
        tacheMap.remove(numTache);
    }

    public List<Tache> getAllTaches() {
        Collection<Tache> c = tacheMap.values();
        List<Tache> list = new ArrayList<Tache>();
        list.addAll(c);
        return list;
    }
}
