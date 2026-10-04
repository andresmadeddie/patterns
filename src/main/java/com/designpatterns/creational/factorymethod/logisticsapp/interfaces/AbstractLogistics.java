package com.designpatterns.creational.factorymethod.logisticsapp.interfaces;

/**
 * Abstract Creator in the Factory Method pattern.
 * Defines the skeleton of the delivery workflow while leaving the
 * decision of *which* Transport to use to its subclasses.
 */
public abstract class AbstractLogistics {

    /**
     * Template-style method that runs the delivery process.
     * It relies on createTransport() to obtain a Transport instance,
     * without knowing which concrete class (Truck, Ship, etc.) is used.
     */
    public void planDelivery() {
        iTransport transport = createTransport(); // delegate creation to subclass
        transport.deliver(); // use the product via its interface
    }

    // Factory Method
    // Subclasses override this to decide which concrete Transport to instantiate.
    protected abstract iTransport createTransport();
}
