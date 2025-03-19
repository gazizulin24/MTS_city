package org.gazizulin.sensor_service.service.data;


import java.util.Map;

public interface EventDataPopulationService {
    String getType();

    Map<String, Object> find(String sensorId);
}
