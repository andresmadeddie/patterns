package com.designpatterns.creational.factorymethod.animalfactory;

import com.designpatterns.creational.factorymethod.animalfactory.classes.CatFactory;
import com.designpatterns.creational.factorymethod.animalfactory.classes.DogFactory;
import com.designpatterns.creational.factorymethod.animalfactory.interfaces.aAnimalFactory;
import com.designpatterns.creational.factorymethod.animalfactory.interfaces.iAnimal;

public class Main {

    public static void main(String[] args) {

        aAnimalFactory factory = new CatFactory();
        iAnimal animal = factory.newAnimal();
        System.out.println(animal.talk());

        // Reusing the variables
        factory = new DogFactory();
        animal = factory.newAnimal();
        System.out.println(animal.talk());
    }
}
