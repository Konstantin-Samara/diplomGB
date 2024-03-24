package com.example.diplomGB.services;

import com.example.diplomGB.models.Command;
import java.util.ArrayList;
import java.util.List;

public interface CommandService {

    public Command createCommand(Command note);

    public List<String> getAllCommands();

    public Command getCommandById(Long id) ;

    public List<String> getCommandByStatus() ;

    public void removePerformerIdFromCommandList(ArrayList<Long> listCommandsId, long performerId);

    public ArrayList<Long> deleteCommand(long id) ;

    public ArrayList<Long> changeCommandStatus(Long id) ;

    public boolean changeCommandPerformer(Long id, Long id1);

    public List<String> complete();
}
