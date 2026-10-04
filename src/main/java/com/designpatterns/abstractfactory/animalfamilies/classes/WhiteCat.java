package com.designpatterns.abstractfactory.animalfamilies.classes;

import com.designpatterns.abstractfactory.animalfamilies.interfaces.iCat;

class WhiteCat implements iCat {
    public String speak() {
        return "White cat says: Meow!";
    }
}