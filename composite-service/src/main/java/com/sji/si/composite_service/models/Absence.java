package com.sji.si.composite_service.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Absence{
    private Long id;
    private Long idE;
    private String date;
}