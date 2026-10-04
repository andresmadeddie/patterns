package com.designpatterns.factorymethod.animalfactory.classes;

import com.designpatterns.factorymethod.animalfactory.interfaces.aAnimalFactory;
import com.designpatterns.factorymethod.animalfactory.interfaces.iAnimal;

public class CatFactory extends aAnimalFactory {
    @Override
    protected iAnimal createAnimal() {
        return new Cat();
    }
}