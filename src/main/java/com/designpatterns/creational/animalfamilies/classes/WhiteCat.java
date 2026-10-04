package com.designpatterns.creational.animalfamilies.classes;

import com.designpatterns.creational.animalfamilies.interfaces.iCat;

class WhiteCat implements iCat {
    public String speak() {
        return "White cat says: Meow!";
    }
}