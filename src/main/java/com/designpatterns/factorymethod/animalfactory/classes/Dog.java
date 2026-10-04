package com.designpatterns.factorymethod.animalfactory.classes;

import com.designpatterns.factorymethod.animalfactory.interfaces.iAnimal;

public class Dog implements iAnimal {
    @Override
    public String talk() {
        return "Arf";
    }
}