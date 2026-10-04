package com.designpatterns.creational.animalfamilies.classes;

import com.designpatterns.creational.animalfamilies.interfaces.iDog;

class BlackDog implements iDog {
    public String speak() {
        return "Black dog says: Woof!";
    }
}