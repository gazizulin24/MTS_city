package org.gazizulin.sensor_service.repository;


import org.gazizulin.sensor_service.repository.entity.LightEventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LightEventRepository extends JpaRepository<LightEventEntity, Integer> {
}
