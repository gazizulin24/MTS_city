package org.gazizulin.sensor_service.service;


import org.gazizulin.sensor_service.controller.response.Sensor;
import org.gazizulin.sensor_service.controller.response.SensorsResponse;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SensorService {

    /**
     * @return list of all sensors
     */
    SensorsResponse findAll();

    /**
     * @param type of sensors to find
     * @return list of sensors by given type
     */
    SensorsResponse findAllByType(String type);
}
