package org.gazizulin.sensor_service.controller;


import lombok.RequiredArgsConstructor;
import org.gazizulin.sensor_service.controller.response.Sensor;
import org.gazizulin.sensor_service.controller.response.SensorsResponse;
import org.gazizulin.sensor_service.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sensors")
@RequiredArgsConstructor
public class SensorControllerImpl implements SensorController {

    @Autowired
    private SensorService sensorService;


    @Override
    @GetMapping("/")
    public ResponseEntity<SensorsResponse> findAllSensors() {
        return ResponseEntity.ok(sensorService.findAll());
    }

    @Override
    @GetMapping("/{type}")
    public ResponseEntity<SensorsResponse> findSensorsByType(@PathVariable String type) {
        return ResponseEntity.ok(sensorService.findAllByType(type));
    }
}
