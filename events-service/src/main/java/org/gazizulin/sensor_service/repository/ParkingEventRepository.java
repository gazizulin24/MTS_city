package org.gazizulin.sensor_service.repository;


import org.gazizulin.sensor_service.repository.entity.ParkingEventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingEventRepository extends JpaRepository<ParkingEventEntity, Integer> {
}
