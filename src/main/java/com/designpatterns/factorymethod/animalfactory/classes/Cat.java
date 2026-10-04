package com.designpatterns.factorymethod.animalfactory.classes;

import com.designpatterns.factorymethod.animalfactory.interfaces.iAnimal;

public class Cat implements iAnimal {
    @Override
    public String talk() {
        return "Miau";
    }
}