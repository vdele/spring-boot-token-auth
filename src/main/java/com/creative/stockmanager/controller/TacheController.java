package com.creative.stockmanager.controller;

import com.creative.stockmanager.entity.Tache;
import com.creative.stockmanager.repository.TacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TacheController {
    @Autowired
    private TacheRepository tacheRepository;


    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "{greeting: 'Hello'}";
    }

    // URL:
    // http://localhost:8080/taches
    @RequestMapping(value = "/taches", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public List<Tache> getTaches() {
        List<Tache> list = tacheRepository.getAllTaches();
        return list;
    }

    // URL:
    // http://localhost:8080/tache/{numTache}
    @RequestMapping(value = "/tache/{numTache}", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Tache getTache(@PathVariable("numTache") Integer numTache) {
        return tacheRepository.getTache(numTache);
    }

    // URL:
    // http://localhost:8080/tache

    @RequestMapping(value = "/tache", //
            method = RequestMethod.POST, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Tache addTache(@RequestBody Tache tache) {

        System.out.println("(Service Side) Creating tache: " + tache.getNumTache());

        return tacheRepository.addTache(tache);
    }

    // URL:
    // http://localhost:8080/tache
    @RequestMapping(value = "/tache", //
            method = RequestMethod.PUT, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Tache updateTache(@RequestBody Tache tache) {

        System.out.println("(Service Side) Editing tache: " + tache.getNumTache());

        return tacheRepository.updateTache(tache);
    }

    // URL:
    // http://localhost:8080/tache/{numTache}
    @RequestMapping(value = "/tache/{numTache}", //
            method = RequestMethod.DELETE, //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public void deleteTache(@PathVariable("numTache") Integer numTache) {

        System.out.println("(Service Side) Deleting tache: " + numTache);

        tacheRepository.deleteTache(numTache);
    }


}
