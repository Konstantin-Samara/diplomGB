package com.example.diplomGB.factorys;

import com.example.diplomGB.models.Command;

public interface CommandFactory {
    Command createCommand(String description);
}
