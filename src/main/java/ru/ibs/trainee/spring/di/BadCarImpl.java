package ru.ibs.trainee.spring.di;

public class BadCarImpl implements Car {

    Engine engine;

    public BadCarImpl() {
        this.engine = new PetrolEngineImpl();
    }

    @Override
    public void drive() {

    }
}
