package com.designpatterns.creational.animalfamilies.classes;

import com.designpatterns.creational.animalfamilies.interfaces.iCat;

class BlackCat implements iCat {
    public String speak() {
        return "Black cat says: Meow!";
    }
}