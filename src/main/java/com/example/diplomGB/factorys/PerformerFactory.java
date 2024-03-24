package com.example.diplomGB.factorys;

import com.example.diplomGB.models.Performer;

public interface PerformerFactory {
    Performer createPerformer(String name);
}
