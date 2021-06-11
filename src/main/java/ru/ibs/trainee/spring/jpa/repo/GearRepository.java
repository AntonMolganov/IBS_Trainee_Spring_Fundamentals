package ru.ibs.trainee.spring.jpa.repo;

import org.springframework.data.repository.CrudRepository;
import ru.ibs.trainee.spring.jpa.entities.Gear;

import java.util.List;

public interface GearRepository extends CrudRepository<Gear, Long> {


    Gear findGearByEngineId(Long engineId);

    List<Gear> findGearsByEngineId(Long engineId);

}
