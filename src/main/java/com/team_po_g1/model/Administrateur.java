package com.team_po_g1.model;


import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonCreator;

import jakarta.persistence.*;

@Entity
@Table(name = "Administrateur")
public class Administrateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String email;

    @Column(length = 50)
    private String nom;

    @Column(length = 100)
    private String prenom;

    @Column(length = 100)
    private String mot_de_passe;

    @Column(length = 50)
    private String role = "ADMIN";
    
    
    
    
    
    
    @Override
    public String toString() {
        return "Administrateur{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", mot_de_passe='" + mot_de_passe + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getMotDePasse() { return mot_de_passe; }
    public void setMotDePasse(String mot_de_passe) { this.mot_de_passe = mot_de_passe; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    
    
    
    
  //Constructeur par  defaut
    @Autowired
    public Administrateur() {
    	
    }
    
	  @JsonCreator
   	public Administrateur (String email,String nom,String prenom,String mot_de_passe, String role ) {
		 this.email=email;
		 this.nom=nom;
		 this.prenom=prenom;
		 this.mot_de_passe=mot_de_passe;
		 this.role=role;
		
	}

    
    
}


