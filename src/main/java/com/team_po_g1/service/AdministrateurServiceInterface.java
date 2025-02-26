package com.team_po_g1.service;

import java.util.List;

import com.team_po_g1.model.Administrateur;

public interface AdministrateurServiceInterface {

	
	
	
	Administrateur creer (Administrateur admin);//constructeur qui permet de creer un Administrateur
    List<Administrateur> lire(); //de lire l'ensemble des Administrateurs
    Administrateur modifier(Long id,Administrateur admin);//faire une mise a jour des données de l'administrateur
    String supprimer(Long id);//supprimer un Admin
	Administrateur verifierCredentials(String motDePasse);
}
