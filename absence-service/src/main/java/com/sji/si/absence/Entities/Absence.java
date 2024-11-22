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
    private Long idEtudiant;

    @Column(nullable = false)
    private Long idUe;

    @Column(nullable = false)
    private Long nombreHeures;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private Boolean statut;

}
