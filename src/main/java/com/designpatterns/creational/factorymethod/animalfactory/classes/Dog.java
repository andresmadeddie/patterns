package com.designpatterns.creational.factorymethod.animalfactory.classes;

import com.designpatterns.creational.factorymethod.animalfactory.interfaces.iAnimal;

public class Dog implements iAnimal {
    @Override
    public String talk() {
        return "Arf";
    }
}