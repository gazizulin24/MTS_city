package org.gazizulin.sensor_service.repository.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "trach_event")
@Data
public class TrashEventEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "plastic_percent")
    private Double plasticPercent;
    @Column(name = "organic_percent")
    private Double organicPercent;
    @Column(name = "glass_percent")
    private Double glassPercent;
    @Column(name = "paper_percent")
    private Double paperPercent;
}
