package ru.ibs.trainee.spring.di;

public class CarExample {

    public static void main(String[] args) {

        // Плохо потому что если нам понадобится поменять двигатель в BarCarImpl придётся переписывать код.
        Car badCar = new BadCarImpl();

        // Хороший пример, т.к. двигатель мы предоставляем сами при создании экземпляра GoodCarImpl
        // через сеттер
        GoodCarImpl goodCarImpl = new GoodCarImpl();
        goodCarImpl.setEngine(new ElectircEngineImpl());
        // или через конструктор
        Car goodCard2 = new GoodCarImpl(new ElectircEngineImpl());
    }
}
