package ru.ibs.trainee.spring.jpa.repo;

import org.springframework.data.repository.CrudRepository;
import ru.ibs.trainee.spring.jpa.entities.Car;

public interface CarRepository extends CrudRepository<Car, Long> {


}
