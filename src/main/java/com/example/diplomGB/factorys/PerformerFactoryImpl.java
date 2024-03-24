package com.example.diplomGB.factorys;

import com.example.diplomGB.models.Performer;

public class PerformerFactoryImpl implements PerformerFactory{
    @Override
    public Performer createPerformer(String name) {

        Performer.PerformerBuilder performerBuilder = new Performer.PerformerBuilder();
        performerBuilder.name(name);

        return performerBuilder.name(name).build();
    }
}
