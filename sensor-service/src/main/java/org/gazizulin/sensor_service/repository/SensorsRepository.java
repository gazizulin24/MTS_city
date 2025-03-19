package org.gazizulin.sensor_service.repository;


import org.gazizulin.sensor_service.repository.entity.SensorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SensorsRepository extends JpaRepository<SensorEntity, Integer> {

    List<SensorEntity> findAllByType(String type);
}
