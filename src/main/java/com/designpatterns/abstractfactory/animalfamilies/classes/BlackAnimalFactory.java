package com.designpatterns.abstractfactory.animalfamilies.classes;

import com.designpatterns.abstractfactory.animalfamilies.interfaces.iAnimalFactory;
import com.designpatterns.abstractfactory.animalfamilies.interfaces.iCat;
import com.designpatterns.abstractfactory.animalfamilies.interfaces.iDog;

public class BlackAnimalFactory implements iAnimalFactory {
    public iDog createDog() {
        return new BlackDog();
    }

    public iCat createCat() {
        return new BlackCat();
    }
}