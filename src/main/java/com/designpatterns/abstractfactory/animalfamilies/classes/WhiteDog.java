package com.designpatterns.abstractfactory.animalfamilies.classes;

import com.designpatterns.abstractfactory.animalfamilies.interfaces.iDog;

class WhiteDog implements iDog {
    public String speak() {
        return "White dog says: Woof!";
    }
}