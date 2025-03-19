package org.gazizulin.sensor_service.service;

import java.util.Map;

public interface EventService {

    /**
     * @return
     */
     Map<String, Object> find(String sensorId, String type);
}
