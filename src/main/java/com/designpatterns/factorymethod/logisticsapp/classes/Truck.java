package com.designpatterns.factorymethod.logisticsapp.classes;

import com.designpatterns.factorymethod.logisticsapp.interfaces.iTransport;

class Truck implements iTransport {
    public void deliver() {
        System.out.println("Delivering by truck");
    }
}
