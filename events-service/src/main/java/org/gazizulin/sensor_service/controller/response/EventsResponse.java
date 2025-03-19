package org.gazizulin.sensor_service.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class EventsResponse {
    Map<String, Object> params;
}
