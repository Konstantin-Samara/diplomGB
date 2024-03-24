package com.example.diplomGB.controllers;

import com.example.diplomGB.facade.Facade;
import com.example.diplomGB.models.Performer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class PerformerControllerImpl implements PerformerController{
    private final Facade facade;

    @Autowired
    public PerformerControllerImpl(Facade facade1) {
        facade = facade1;
    }

    public List<String> getAllPerformers() {
            return facade.getAllPerformers();
        }

    public String getPerformerById(@PathVariable Long id) {
        return facade.getPerformerById(id).toString();
    }

    public List<String> getPerformerByStatus(){
        return facade.getPerformerByStatus();
    }

    public String createPerformer(@RequestBody Performer note) {
        return facade.createPerformer(note).toString();
    }

    public void deletePerformer(@PathVariable Long id) {
        facade.deletePerformer(id);
    }

    public List<String> complete() { return facade.completePerformers(); }

}
