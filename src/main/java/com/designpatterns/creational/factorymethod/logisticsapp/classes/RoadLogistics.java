package com.designpatterns.creational.factorymethod.logisticsapp.classes;

import com.designpatterns.creational.factorymethod.logisticsapp.interfaces.AbstractLogistics;
import com.designpatterns.creational.factorymethod.logisticsapp.interfaces.iTransport;

public class RoadLogistics extends AbstractLogistics {
    @Override
    protected iTransport createTransport() {
        return new Truck();
    }
}
