package org.gazizulin.sensor_service.repository;


import org.gazizulin.sensor_service.repository.entity.TrashEventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrashEventRepository extends JpaRepository<TrashEventEntity, Integer> {
}
