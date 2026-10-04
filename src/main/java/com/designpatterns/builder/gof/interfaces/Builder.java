package com.designpatterns.builder.gof.interfaces;

import com.designpatterns.builder.gof.product.Computer;

public interface Builder {
    void buildCPU();

    void buildRAM();

    void buildStorage();

    Computer getResult();
}