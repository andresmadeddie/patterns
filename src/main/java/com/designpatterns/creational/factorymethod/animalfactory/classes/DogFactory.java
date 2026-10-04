package com.designpatterns.creational.factorymethod.animalfactory.classes;

import com.designpatterns.creational.factorymethod.animalfactory.interfaces.aAnimalFactory;
import com.designpatterns.creational.factorymethod.animalfactory.interfaces.iAnimal;

public class DogFactory extends aAnimalFactory {
    @Override
    protected iAnimal createAnimal() {
        return new Dog();
    }
}