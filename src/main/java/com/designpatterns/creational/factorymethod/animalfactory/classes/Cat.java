package com.designpatterns.creational.factorymethod.animalfactory.classes;

import com.designpatterns.creational.factorymethod.animalfactory.interfaces.iAnimal;

public class Cat implements iAnimal {
    @Override
    public String talk() {
        return "Miau";
    }
}