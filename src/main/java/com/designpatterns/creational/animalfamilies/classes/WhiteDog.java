package com.designpatterns.creational.animalfamilies.classes;

import com.designpatterns.creational.animalfamilies.interfaces.iDog;

class WhiteDog implements iDog {
    public String speak() {
        return "White dog says: Woof!";
    }
}