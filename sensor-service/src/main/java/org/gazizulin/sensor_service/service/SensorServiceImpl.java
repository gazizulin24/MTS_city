package org.gazizulin.sensor_service.service;


import org.gazizulin.sensor_service.controller.response.Sensor;
import org.gazizulin.sensor_service.controller.response.SensorsResponse;
import org.gazizulin.sensor_service.mapper.SensorsMapper;
import org.gazizulin.sensor_service.repository.SensorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SensorServiceImpl implements SensorService {

    @Autowired
    private SensorsRepository sensorsRepository;

    private SensorsMapper mapper = SensorsMapper.INSTANCE;

    @Override
    public SensorsResponse findAll() {
        return new SensorsResponse(mapper.map(sensorsRepository.findAll()));
    }

    @Override
    public SensorsResponse findAllByType(String type) {
        return new SensorsResponse(mapper.map(sensorsRepository.findAllByType(type)));
    }
}
