package com.team_po_g1.service;



import com.team_po_g1.model.Administrateur;
import com.team_po_g1.repository.AdministrateurRepository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AdministrateurService implements AdministrateurServiceInterface{

    @Autowired
   /* private AdministrateurRepository repository;

    public List<Administrateur> getAllAdmins() {
        return repository.findAll();
    }

    public Optional<Administrateur> getAdminByEmail(String email) {
        return repository.findByEmail(email);
    }

    public Administrateur createAdmin(Administrateur admin) {
        return repository.save(admin);
    }

    public void deleteAdmin(Long id) {
        repository.deleteById(id);
    }*/

    



	
	private AdministrateurRepository adminRipository;
	
    @Override
	public Administrateur creer(Administrateur admin) {
		// TODO Auto-generated method stub
		return adminRipository.save(admin);
	}

	@Override
	public List<Administrateur> lire() {
		// TODO Auto-generated method stub
		return adminRipository.findAll();
	}
	
	
	
	@Override
	@Transactional
	public Administrateur modifier(Long id, Administrateur admin) {
	    Optional<Administrateur> existingEmpOptional = adminRipository.findById(id);
	    if (existingEmpOptional.isPresent()) {
	        Administrateur existingEmp = existingEmpOptional.get();
	        // Mise à jour des champs, en vérifiant qu'ils ne sont pas null
	        if(admin.getNom() != null) existingEmp.setNom(admin.getNom());
	        // ... autres champs ...
	        return adminRipository.save(existingEmp); // Mise à jour
	    } else {
	        // Gérer le cas où l'employé n'existe pas
	        throw new EntityNotFoundException("Admin avec ID " + id + " n'existe pas.");
	    }
	}
	

	
	@Override
	public String supprimer(Long id) {
		// TODO Auto-generated method stub
		 adminRipository.deleteById(id);
		return ("Employe supprimer avec succes");
	}

	@Override
	public Administrateur verifierCredentials(String motDePasse) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	/*	
	@Override
	  public Administrateur verifierCredentials(String motDePasse) {
    return adminRipository.findAllById(motDePasse)
            .filter(admin -> admin.getMot_De_Passe().equals(motDePasse))
            .orElse(null);
}

	
*/



}
