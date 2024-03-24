package com.example.diplomGB.factorys;

import com.example.diplomGB.models.Command;

public class CommandFactoryImpl implements CommandFactory{
    public Command createCommand(String description) {

        Command.CommandBuilder commandBuilder = new Command.CommandBuilder();
        commandBuilder.description(description);

        return commandBuilder.description(description).build();
    }
}
