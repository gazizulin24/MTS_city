package org.gazizulin.sensor_service.controller;


import org.gazizulin.sensor_service.controller.response.EventsResponse;
import org.springframework.http.ResponseEntity;

public interface EventsController {

    /**
     *
     * @param sensorId
     * @return
     */
    ResponseEntity<EventsResponse> find(String sensorId, String type);
}
