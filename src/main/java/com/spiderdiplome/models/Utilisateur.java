package com.spiderdiplome.models;

import java.sql.Timestamp;
import java.util.Date;

public class Utilisateur {

    private int id;
    private String Nom;
    private String prenom;
    private String email;
    private String phone;
    private String matricule;
    private String motDePasse;
    private String role;
    private Timestamp dateInscription;
    private int statut;
    private Timestamp dateCreation;
    private Timestamp derniereConnexion;
    private Timestamp dateModification;
    private Date dateNaissance;
    private String genre;
    private String photoProfil;
    private String bio;
    private String adresse;
    private String salt;
    private String lastLoginIP;
    private int failedLoginAttempts;
    private boolean accountLocked;
    private String resetPasswordToken;
    private Timestamp resetPasswordExpiry;
    private boolean twoFactorEnabled;
    private String twoFactorSecret;

    public Utilisateur() {
    }

    public Utilisateur(String nom, String prenom, String phone, String motDePasse, String salt) {
        Nom = nom;
        this.prenom = prenom;
        this.phone = phone;
        this.motDePasse = motDePasse;
        this.salt = salt;
    }

    public Utilisateur(String nom, String prenom, String email, String phone, String matricule, String motDePasse, String role, Timestamp dateInscription, int statut, Timestamp dateCreation, Timestamp derniereConnexion, Timestamp dateModification, Date dateNaissance, String genre, String photoProfil, String bio, String adresse, String salt, String lastLoginIP, int failedLoginAttempts, boolean accountLocked, String resetPasswordToken, Timestamp resetPasswordExpiry, boolean twoFactorEnabled, String twoFactorSecret) {
        Nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.phone = phone;
        this.matricule = matricule;
        this.motDePasse = motDePasse;
        this.role = role;
        this.dateInscription = dateInscription;
        this.statut = statut;
        this.dateCreation = dateCreation;
        this.derniereConnexion = derniereConnexion;
        this.dateModification = dateModification;
        this.dateNaissance = dateNaissance;
        this.genre = genre;
        this.photoProfil = photoProfil;
        this.bio = bio;
        this.adresse = adresse;
        this.salt = salt;
        this.lastLoginIP = lastLoginIP;
        this.failedLoginAttempts = failedLoginAttempts;
        this.accountLocked = accountLocked;
        this.resetPasswordToken = resetPasswordToken;
        this.resetPasswordExpiry = resetPasswordExpiry;
        this.twoFactorEnabled = twoFactorEnabled;
        this.twoFactorSecret = twoFactorSecret;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Timestamp getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Timestamp dateInscription) {
        this.dateInscription = dateInscription;
    }

    public int getStatut() {
        return statut;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }

    public Timestamp getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Timestamp dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Timestamp getDerniereConnexion() {
        return derniereConnexion;
    }

    public void setDerniereConnexion(Timestamp derniereConnexion) {
        this.derniereConnexion = derniereConnexion;
    }

    public Timestamp getDateModification() {
        return dateModification;
    }

    public void setDateModification(Timestamp dateModification) {
        this.dateModification = dateModification;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPhotoProfil() {
        return photoProfil;
    }

    public void setPhotoProfil(String photoProfil) {
        this.photoProfil = photoProfil;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getLastLoginIP() {
        return lastLoginIP;
    }

    public void setLastLoginIP(String lastLoginIP) {
        this.lastLoginIP = lastLoginIP;
    }

    public int getFailedLoginAttempts() {
        return failedLoginAttempts;
    }

    public void setFailedLoginAttempts(int failedLoginAttempts) {
        this.failedLoginAttempts = failedLoginAttempts;
    }

    public boolean isAccountLocked() {
        return accountLocked;
    }

    public void setAccountLocked(boolean accountLocked) {
        this.accountLocked = accountLocked;
    }

    public String getResetPasswordToken() {
        return resetPasswordToken;
    }

    public void setResetPasswordToken(String resetPasswordToken) {
        this.resetPasswordToken = resetPasswordToken;
    }

    public Timestamp getResetPasswordExpiry() {
        return resetPasswordExpiry;
    }

    public void setResetPasswordExpiry(Timestamp resetPasswordExpiry) {
        this.resetPasswordExpiry = resetPasswordExpiry;
    }

    public boolean isTwoFactorEnabled() {
        return twoFactorEnabled;
    }

    public void setTwoFactorEnabled(boolean twoFactorEnabled) {
        this.twoFactorEnabled = twoFactorEnabled;
    }

    public String getTwoFactorSecret() {
        return twoFactorSecret;
    }

    public void setTwoFactorSecret(String twoFactorSecret) {
        this.twoFactorSecret = twoFactorSecret;
    }
}