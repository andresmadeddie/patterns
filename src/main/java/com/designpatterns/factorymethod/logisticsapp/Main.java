package com.designpatterns.factorymethod.logisticsapp;

import com.designpatterns.factorymethod.logisticsapp.classes.RoadLogistics;
import com.designpatterns.factorymethod.logisticsapp.classes.SeaLogistics;
import com.designpatterns.factorymethod.logisticsapp.interfaces.AbstractLogistics;

public class Main {

    public static void main(String[] args) {
        AbstractLogistics logistics = new RoadLogistics();
        logistics.planDelivery(); // Delivering by truck

        logistics = new SeaLogistics();
        logistics.planDelivery(); // Delivering by ship
    }
}
