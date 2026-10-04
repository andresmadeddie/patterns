package com.designpatterns.creational.animalfamilies.classes;

import com.designpatterns.creational.animalfamilies.interfaces.iAnimalFactory;
import com.designpatterns.creational.animalfamilies.interfaces.iCat;
import com.designpatterns.creational.animalfamilies.interfaces.iDog;

public class WhiteAnimalFactory implements iAnimalFactory {
    public iDog createDog() {
        return new WhiteDog();
    }

    public iCat createCat() {
        return new WhiteCat();
    }
}