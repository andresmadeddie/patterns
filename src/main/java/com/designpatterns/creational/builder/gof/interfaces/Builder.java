package com.designpatterns.creational.builder.gof.interfaces;

import com.designpatterns.creational.builder.gof.product.Computer;

public interface Builder {
    void buildCPU();

    void buildRAM();

    void buildStorage();

    Computer getResult();
}