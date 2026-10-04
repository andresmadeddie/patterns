package com.designpatterns.creational.animalfamilies.classes;

import com.designpatterns.creational.animalfamilies.interfaces.iAnimalFactory;
import com.designpatterns.creational.animalfamilies.interfaces.iCat;
import com.designpatterns.creational.animalfamilies.interfaces.iDog;

public class BlackAnimalFactory implements iAnimalFactory {
    public iDog createDog() {
        return new BlackDog();
    }

    public iCat createCat() {
        return new BlackCat();
    }
}