package com.designpatterns.builder.gof.concretebuilders;

import com.designpatterns.builder.gof.interfaces.Builder;
import com.designpatterns.builder.gof.product.Computer;

// ConcreteBuilder 1
public class GamingComputerBuilder implements Builder {
    private Computer computer = new Computer();

    public void buildCPU() {
        computer.setCPU("Gaming CPU (8-core, high clock)");
    }

    public void buildRAM() {
        computer.setRAM("32GB DDR5");
    }

    public void buildStorage() {
        computer.setStorage("2TB NVMe SSD");
    }

    public Computer getResult() {
        return computer;
    }
}
