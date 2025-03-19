package org.gazizulin.sensor_service.service.data;

import org.gazizulin.sensor_service.repository.TrashEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EventDataPopulationServiceTrash implements EventDataPopulationService {


    @Autowired
    private TrashEventRepository trashEventRepository;

    @Override
    public String getType() {
        return "TRASH_BIN";
    }

    @Override
    public Map<String, Object> find(String sensorId) {
        Map<String, Object> data = new HashMap<>();
        var event = trashEventRepository.findById(Integer.valueOf(sensorId)).get();
        data.put("id", event.getId());
        data.put("glassPercent", event.getGlassPercent());
        data.put("organicPercent", event.getOrganicPercent());
        data.put("paperPercent", event.getPaperPercent());
        data.put("plasticPercent", event.getPlasticPercent());
        return data;
    }
}
