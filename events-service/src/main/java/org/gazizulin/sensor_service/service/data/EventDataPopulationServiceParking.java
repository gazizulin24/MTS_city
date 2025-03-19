package org.gazizulin.sensor_service.service.data;


import org.gazizulin.sensor_service.repository.ParkingEventRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class EventDataPopulationServiceParking implements EventDataPopulationService {

    @Autowired
    private ParkingEventRepository parkingEventRepository;

    @Override
    public String getType() {
        return "PARKING";
    }

    @Override
    public Map<String, Object> find(String sensorId) {
        Map<String, Object> data = new HashMap<>();
        var event = parkingEventRepository.findById(Integer.valueOf(sensorId)).get();
        data.put("id", event.getId());
        data.put("freeCount", event.getFreeCount());
        data.put("electrocarsFreeCount", event.getElectrocarsFreeCount());
        data.put("motorcarsFreeCount", event.getMotorcarsFreeCount());
        data.put("totalCount", event.getTotalCount());
        data.put("electrocardTotalCount", event.getElectrocarsTotalCount());
        data.put("motorcarsTotalCount", event.getMotorcarsTotalCount());
        return data;
    }
}
