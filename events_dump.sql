CREATE TABLE trach_event (
                             id INT PRIMARY KEY,
                             sensor_id INT,
                             plastic_percent DOUBLE,
                             organic_percent DOUBLE,
                             glass_percent DOUBLE,
                             paper_percent DOUBLE
);
INSERT INTO trach_event (id, plastic_percent, organic_percent, glass_percent, paper_percent)
VALUES (43929,40.5, 30.0, 15.2, 14.3),
       (43933, 50.1, 25.0, 12.4, 12.5),
       (43934, 60.3, 20.5, 10.0, 9.2),
       (43935, 45.7, 35.0, 10.5, 8.8);

CREATE TABLE parking_event (
                               id INT PRIMARY KEY,
                               sensor_id INT,
                               total_count BIGINT,
                               free_count BIGINT,
                               electrocars_total_count BIGINT,
                               electrocars_free_count BIGINT,
                               motorcars_total_count BIGINT,
                               motorcars_free_count BIGINT
);


INSERT INTO parking_event (id, sensor_id, total_count, free_count, electrocars_total_count, electrocars_free_count, motorcars_total_count, motorcars_free_count)
VALUES (43930,1, 100, 20, 30, 5, 70, 15),
       (43931, 2, 150, 30, 40, 8, 110, 22),
       (43932, 3, 200, 50, 60, 20, 140, 30);

