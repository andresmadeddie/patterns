package com.designpatterns.builder.gof.concretebuilders;

import com.designpatterns.builder.gof.interfaces.Builder;
import com.designpatterns.builder.gof.product.Computer;

// ConcreteBuilder 2
public class OfficeComputerBuilder implements Builder {
    private Computer computer = new Computer();

    public void buildCPU() {
        computer.setCPU("Office CPU (4-core, low power)");
    }

    public void buildRAM() {
        computer.setRAM("8GB DDR4");
    }

    public void buildStorage() {
        computer.setStorage("256GB SSD");
    }

    public Computer getResult() {
        return computer;
    }
}
