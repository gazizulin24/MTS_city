package org.gazizulin.sensor_service.service;


import org.gazizulin.sensor_service.service.data.EventDataPopulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private List<EventDataPopulationService> populationServices;


    @Override
    public Map<String, Object> find(String sensorId, String type) {
        return populationServices.stream()
                .filter(service -> service.getType().equals(type)).toList().get(0)
                .find(sensorId);
    }
}
