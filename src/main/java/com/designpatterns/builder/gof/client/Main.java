package com.designpatterns.builder.gof.client;

import com.designpatterns.builder.gof.director.ComputerDirector;
import com.designpatterns.builder.gof.concretebuilders.GamingComputerBuilder;
import com.designpatterns.builder.gof.concretebuilders.OfficeComputerBuilder;
import com.designpatterns.builder.gof.product.Computer;

// Client
public class Main {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();

        GamingComputerBuilder gamingBuilder = new GamingComputerBuilder();
        director.construct(gamingBuilder);
        Computer gamingComputer = gamingBuilder.getResult();

        OfficeComputerBuilder officeBuilder = new OfficeComputerBuilder();
        director.construct(officeBuilder);
        Computer officeComputer = officeBuilder.getResult();

        gamingComputer.displayInfo();
        officeComputer.displayInfo();
    }
}
