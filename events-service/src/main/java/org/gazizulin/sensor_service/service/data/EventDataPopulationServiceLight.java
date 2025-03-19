package org.gazizulin.sensor_service.service.data;


import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class EventDataPopulationServiceLight implements EventDataPopulationService {
    @Override
    public String getType() {
        return "LIGHT";
    }

    @Override
    public Map<String, Object> find(String sensorId) {
        return Map.of();
    }
}
