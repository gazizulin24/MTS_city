package org.gazizulin.sensor_service.mapper;


import org.gazizulin.sensor_service.controller.response.Sensor;
import org.gazizulin.sensor_service.repository.entity.SensorEntity;

import java.util.List;

public final class SensorsMapper {

    public static SensorsMapper INSTANCE = new SensorsMapper();

    private SensorsMapper() {}


    public List<Sensor> map(List<SensorEntity> sensors) {
        return sensors.stream().map(this::map).toList();
    }

    public Sensor map(SensorEntity source) {
        Sensor sensor = new Sensor();
        sensor.setId(source.getId());
        sensor.setName(source.getName());
        sensor.setType(source.getType());
        sensor.setLatitude(source.getLatitude());
        sensor.setLongitude(source.getLongitude());
        return sensor;
    }

    public SensorEntity map(Sensor source) {
        SensorEntity sensor = new SensorEntity();
        sensor.setId(source.getId());
        sensor.setName(source.getName());
        sensor.setType(source.getType());
        sensor.setLatitude(source.getLatitude());
        sensor.setLongitude(source.getLongitude());
        return sensor;
    }
}
