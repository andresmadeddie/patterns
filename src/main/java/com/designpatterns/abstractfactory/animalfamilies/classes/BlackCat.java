package com.designpatterns.abstractfactory.animalfamilies.classes;

import com.designpatterns.abstractfactory.animalfamilies.interfaces.iCat;

class BlackCat implements iCat {
    public String speak() {
        return "Black cat says: Meow!";
    }
}