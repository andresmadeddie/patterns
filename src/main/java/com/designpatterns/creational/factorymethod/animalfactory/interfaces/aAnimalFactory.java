package com.designpatterns.creational.factorymethod.animalfactory.interfaces;

public abstract class aAnimalFactory {
    // The factory method: subclasses decide what to instantiate
    protected abstract iAnimal createAnimal();

    /**
     * Public entry point of the factory. Without this method, the factory
     * method pattern would not work in this design:
     *
     * - createAnimal() is protected, so clients cannot call it. Without
     * newAnimal(), nobody outside the class hierarchy could get an animal.
     * - It holds the steps shared by every animal (currently logging), so
     * they are written once here instead of being duplicated in each subclass.
     * - Clients only depend on the iAnimal interface and never on Cat or Dog,
     * because this method calls createAnimal() and lets the subclass choose
     * which concrete animal to build.
     */
    public iAnimal newAnimal() {
        iAnimal animal = createAnimal();
        System.out.println("New " + animal.getClass().getSimpleName() + " created");
        return animal;
    }
}