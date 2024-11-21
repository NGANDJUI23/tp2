package com.SJI.SI.microservice.gestion_des_etudiants.gestion_des_etudiants.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private Date datedenaissance;
    private String lieudenaissance;
    private String email;
    private String classe;
    private String filiere;
    private String ecole;
    private String motdepasse;
    private String photoPath;



    /**
     * @return String return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return String return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return Date return the datedenaissance
     */
    public Date getDatedenaissance() {
        return datedenaissance;
    }

    /**
     * @param datedenaissance the datedenaissance to set
     */
    public void setDatedenaissance(Date datedenaissance) {
        this.datedenaissance = datedenaissance;
    }

    /**
     * @return String return the lieudenaissance
     */
    public String getLieudenaissance() {
        return lieudenaissance;
    }

    /**
     * @param lieudenaissance the lieudenaissance to set
     */
    public void setLieudenaissance(String lieudenaissance) {
        this.lieudenaissance = lieudenaissance;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String return the classe
     */
    public String getClasse() {
        return classe;
    }

    /**
     * @param classe the classe to set
     */
    public void setClasse(String classe) {
        this.classe = classe;
    }

    /**
     * @return String return the filiere
     */
    public String getFiliere() {
        return filiere;
    }

    /**
     * @param filiere the filiere to set
     */
    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    /**
     * @return String return the ecole
     */
    public String getEcole() {
        return ecole;
    }

    /**
     * @param ecole the ecole to set
     */
    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    /**
     * @return String return the motdepasse
     */
    public String getMotdepasse() {
        return motdepasse;
    }

    /**
     * @param motdepasse the motdepasse to set
     */
    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    /**
     * @return String return the photoPath
     */
    public String getPhotoPath() {
        return photoPath;
    }

    /**
     * @param photoPath the photoPath to set
     */
    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

}
