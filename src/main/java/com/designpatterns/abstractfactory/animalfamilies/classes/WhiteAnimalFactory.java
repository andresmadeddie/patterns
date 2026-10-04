package com.designpatterns.abstractfactory.animalfamilies.classes;

import com.designpatterns.abstractfactory.animalfamilies.interfaces.iAnimalFactory;
import com.designpatterns.abstractfactory.animalfamilies.interfaces.iCat;
import com.designpatterns.abstractfactory.animalfamilies.interfaces.iDog;

public class WhiteAnimalFactory implements iAnimalFactory {
    public iDog createDog() {
        return new WhiteDog();
    }

    public iCat createCat() {
        return new WhiteCat();
    }
}