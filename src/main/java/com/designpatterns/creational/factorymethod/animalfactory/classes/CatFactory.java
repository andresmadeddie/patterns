package com.designpatterns.creational.factorymethod.animalfactory.classes;

import com.designpatterns.creational.factorymethod.animalfactory.interfaces.aAnimalFactory;
import com.designpatterns.creational.factorymethod.animalfactory.interfaces.iAnimal;

public class CatFactory extends aAnimalFactory {
    @Override
    protected iAnimal createAnimal() {
        return new Cat();
    }
}