package com.designpatterns.creational.factorymethod.logisticsapp;

import com.designpatterns.creational.factorymethod.logisticsapp.classes.RoadLogistics;
import com.designpatterns.creational.factorymethod.logisticsapp.classes.SeaLogistics;
import com.designpatterns.creational.factorymethod.logisticsapp.interfaces.AbstractLogistics;

public class Main {

    public static void main(String[] args) {
        AbstractLogistics logistics = new RoadLogistics();
        logistics.planDelivery(); // Delivering by truck

        logistics = new SeaLogistics();
        logistics.planDelivery(); // Delivering by ship
    }
}
