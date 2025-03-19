package org.gazizulin.sensor_service.controller.response;


import lombok.Data;

@Data
public class Sensor {
    private Long id;
    private String name;
    private String type;
    private Double latitude;
    private Double longitude;
}
