package com.sji.si.absence.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@Entity
@Table
public class Absence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long id_etudiant;

    @Column(nullable = false)
    private Long id_ue;

    @Column(nullable = false)
    private Long nombre_heures;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private Boolean statut;

}
