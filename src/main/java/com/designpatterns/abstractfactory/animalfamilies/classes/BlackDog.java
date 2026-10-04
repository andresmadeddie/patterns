package com.designpatterns.abstractfactory.animalfamilies.classes;

import com.designpatterns.abstractfactory.animalfamilies.interfaces.iDog;

class BlackDog implements iDog {
    public String speak() {
        return "Black dog says: Woof!";
    }
}