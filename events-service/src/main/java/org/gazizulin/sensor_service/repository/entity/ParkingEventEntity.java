package org.gazizulin.sensor_service.repository.entity;


import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.Data;
import org.yaml.snakeyaml.events.Event;


@Entity
@Table(name = "parking_event")
@Data
public class ParkingEventEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer sensorId;

    @Column(name = "total_count")
    private Long totalCount;
    @Column(name = "free_count")
    private Long freeCount;
    @Column(name = "electrocars_total_count")
    private Long electrocarsTotalCount;
    @Column(name = "electrocars_free_count")
    private Long electrocarsFreeCount;
    @Column(name = "motorcars_total_count")
    private Long motorcarsTotalCount;
    @Column(name = "motorcars_free_count")
    private Long motorcarsFreeCount;
}
