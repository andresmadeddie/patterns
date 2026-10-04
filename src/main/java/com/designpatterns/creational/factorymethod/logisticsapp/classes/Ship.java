package com.designpatterns.creational.factorymethod.logisticsapp.classes;

import com.designpatterns.creational.factorymethod.logisticsapp.interfaces.iTransport;

class Ship implements iTransport {
    public void deliver() {
        System.out.println("Delivering by ship");
    }
}
