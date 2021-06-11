package ru.ibs.trainee.spring.jpa.service;

import ru.ibs.trainee.spring.jpa.entities.Car;
import ru.ibs.trainee.spring.jpa.entities.Gear;

import java.util.List;

public interface GearSevice {

    Gear findGear(Car car);
    List<Gear> findGears(Car car);
}
