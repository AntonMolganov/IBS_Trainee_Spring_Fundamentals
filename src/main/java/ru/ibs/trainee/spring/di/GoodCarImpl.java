package ru.ibs.trainee.spring.di;

public class GoodCarImpl implements Car{

    private Engine engine;

    public GoodCarImpl() {
    }

    public GoodCarImpl(Engine engine) {
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {

    }

}
