package com.designpatterns.creational.animalfamilies;

import com.designpatterns.creational.animalfamilies.classes.BlackAnimalFactory;
import com.designpatterns.creational.animalfamilies.classes.WhiteAnimalFactory;
import com.designpatterns.creational.animalfamilies.interfaces.iAnimalFactory;
import com.designpatterns.creational.animalfamilies.interfaces.iCat;
import com.designpatterns.creational.animalfamilies.interfaces.iDog;

public class Main {

    static void meetPets(iAnimalFactory factory) {
        iDog dog = factory.createDog();
        iCat cat = factory.createCat();
        System.out.println(dog.speak());
        System.out.println(cat.speak());
    }

    public static void main(String[] args) {
        System.out.println("--- White family ---");
        meetPets(new WhiteAnimalFactory());

        System.out.println("--- Black family ---");
        meetPets(new BlackAnimalFactory());
    }

}
