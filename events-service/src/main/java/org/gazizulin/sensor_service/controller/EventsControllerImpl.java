package org.gazizulin.sensor_service.controller;


import lombok.RequiredArgsConstructor;
import org.gazizulin.sensor_service.controller.response.EventsResponse;
import org.gazizulin.sensor_service.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/events")
@RequiredArgsConstructor
public class EventsControllerImpl implements EventsController {

    @Autowired
    private EventService eventService;

    @Override
    @GetMapping()
    public ResponseEntity<EventsResponse> find(@PathVariable("sensorId") String sensorId, @PathVariable("type") String type) {
        return ResponseEntity.ok(new EventsResponse(eventService.find(sensorId, type)));
    }
}
