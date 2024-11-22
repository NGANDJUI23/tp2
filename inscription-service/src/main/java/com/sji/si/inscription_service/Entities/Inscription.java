package com.sji.si.inscription_service.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long idEtudiant;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private Long montant;

    @Column(nullable = false)
    private String libelle;

    @Column(nullable = false)
    private Boolean statut;
}
