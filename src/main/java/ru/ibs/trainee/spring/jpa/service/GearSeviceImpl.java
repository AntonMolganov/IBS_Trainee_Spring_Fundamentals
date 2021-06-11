package ru.ibs.trainee.spring.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibs.trainee.spring.jpa.entities.Car;
import ru.ibs.trainee.spring.jpa.entities.Gear;
import ru.ibs.trainee.spring.jpa.repo.GearRepository;

import java.util.List;

@Service
public class GearSeviceImpl implements GearSevice {

    @Autowired
    private GearRepository gearRepository;

    @Override
    public Gear findGear(Car car) {

        return gearRepository.findGearByEngineId(car.getEngine().getId());
    }

    @Override
    public List<Gear> findGears(Car car) {
        return gearRepository.findGearsByEngineId(car.getEngine().getId());
    }
}
