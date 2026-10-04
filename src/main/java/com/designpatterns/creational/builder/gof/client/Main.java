package com.designpatterns.creational.builder.gof.client;

import com.designpatterns.creational.builder.gof.director.ComputerDirector;
import com.designpatterns.creational.builder.gof.concretebuilders.GamingComputerBuilder;
import com.designpatterns.creational.builder.gof.concretebuilders.OfficeComputerBuilder;
import com.designpatterns.creational.builder.gof.product.Computer;

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
