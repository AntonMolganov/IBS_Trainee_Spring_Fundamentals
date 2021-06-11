package ru.ibs.trainee.spring.jpa.service;

import ru.ibs.trainee.spring.jpa.entities.Car;

public interface CarService {
    Car addCar(String mnfName, String modelName, String engineType);
}
