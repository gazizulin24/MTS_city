package org.gazizulin.sensor_service.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class SensorsResponse {
    private List<Sensor> sensors;
}
