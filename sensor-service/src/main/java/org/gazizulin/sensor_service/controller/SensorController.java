package org.gazizulin.sensor_service.controller;


import org.gazizulin.sensor_service.controller.response.Sensor;
import org.gazizulin.sensor_service.controller.response.SensorsResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SensorController {

    /**
     * @return list of all sensors
     */
    ResponseEntity<SensorsResponse> findAllSensors();

    /**
     *
     * @param type
     * @return list of sensors by given type
     */
    ResponseEntity<SensorsResponse> findSensorsByType(String type);
}
