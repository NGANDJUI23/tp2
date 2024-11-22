package com.sji.si.composite_service.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EtudiantAvecDetails {
    private Long id;
    private String name;
    private Long absenceCount;
}
