package com.designpatterns.creational.builder.gof.director;

import com.designpatterns.creational.builder.gof.interfaces.Builder;

// Director: same construction process, different builders
public class ComputerDirector {
    public void construct(Builder builder) {
        builder.buildCPU();
        builder.buildRAM();
        builder.buildStorage();
    }
}
