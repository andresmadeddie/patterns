package com.designpatterns.factorymethod.logisticsapp.classes;

import com.designpatterns.factorymethod.logisticsapp.interfaces.AbstractLogistics;
import com.designpatterns.factorymethod.logisticsapp.interfaces.iTransport;

public class RoadLogistics extends AbstractLogistics {
    @Override
    protected iTransport createTransport() {
        return new Truck();
    }
}
