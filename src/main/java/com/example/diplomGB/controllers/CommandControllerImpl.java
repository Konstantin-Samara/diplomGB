package com.example.diplomGB.controllers;

import com.example.diplomGB.facade.Facade;
import com.example.diplomGB.models.Command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CommandControllerImpl implements CommandController {

    private final Facade facade;

    @Autowired
    public CommandControllerImpl(Facade facade1) {
        facade = facade1;
    }

    public List<String> getAllCommands() {
        return facade.getAllCommands();
    }

    public String getCommandById(@PathVariable Long id) {
        return facade.getCommandById(id).toString();
    }

    public List<String> getCmmandByStatus(){
        return facade.getCommandByStatus();
    }

    public String createCommand(@RequestBody Command note) {
        return facade.createCommand(note).toString();
    }

    public String changeCommandStatus(@PathVariable Long id) {
        return facade.changeCommandStatus(id).toString();
    }

    public void deleteCommand(@PathVariable Long id) {
        facade.deleteCommand(id);
    }

    public String changeCommandPerformer(@PathVariable Long id, @PathVariable Long id1) {

        return facade.changeCommandPerformer(id,id1);

    }

    public List<String> complete() {return facade.completeCommands();}

}
