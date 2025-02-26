package com.team_po_g1.controller;



import com.team_po_g1.model.Administrateur;
import com.team_po_g1.service.AdministrateurService;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



/*


@RestController  // Utilise RestController pour exposer l'API REST
@RequestMapping("/api/admins")  // Spécifie le préfixe /api/admins
@CrossOrigin(origins = "http://localhost:8082")  // Autorise Angular (optionnel)
//@Table(name= "Administrateur")


public class AdministrateurController {

    @Autowired
    private AdministrateurService service;

    // Méthode pour récupérer tous les administrateurs
    @GetMapping
    public List<Administrateur> getAllAdmins() {
        return service.getAllAdmins();
    }
    
    
   
    
	@GetMapping(path = "/read")
	public ResponseEntity<List<Administrateur>> getAllEmployes() {
	    List<Administrateur> admin = service.lire();
	  System.out.println(admin);
	    return ResponseEntity.ok().body(admin);
	}

    
    // Méthode pour récupérer un administrateur par son email
    @GetMapping("/{email}")
    public Optional<Administrateur> getAdminByEmail(@PathVariable String email) {
        return service.getAdminByEmail(email);
    }

    // Méthode pour créer un administrateur
    @PostMapping
    public Administrateur createAdmin(@RequestBody Administrateur admin) {
        return service.createAdmin(admin);
    }

    // Méthode pour supprimer un administrateur par son id
    @DeleteMapping("/{id}")
    public void deleteAdmin(@PathVariable Long id) {
        service.deleteAdmin(id);
    }
}

*/


@AllArgsConstructor
@RestController
@RequestMapping("/api/admins")  // Ce chemin doit être correctement défini
@CrossOrigin(origins = "http://localhost:8082")
public class AdministrateurController {

    @Autowired
    private AdministrateurService service;

/*    // Méthode pour récupérer tous les administrateurs
    @GetMapping
    public List<Administrateur> getAllAdmins() {
        System.out.println("Méthode appelée");
        return service.getAllAdmins();
    }
    */
    
	@PostMapping(path = "/create")
	public Administrateur create(@RequestBody Administrateur admin) {
		//System.out.println(emp);
		return service.creer(admin);
		
	}
	

	
	
	
	@GetMapping(path = "/read")
	public ResponseEntity<List<Administrateur>> getAllEmployes() {
	    List<Administrateur> admin = service.lire();
	  System.out.println(admin);
	    return ResponseEntity.ok().body(admin);
	}
    
	
	
	@PutMapping(path = "/update/{id}") //?name=gestcon
	public Administrateur update(@PathVariable Long id,@RequestBody Administrateur admin) {
		System.out.println(admin);
		return service.modifier(id, admin);
	
	
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public String delte (@PathVariable Long id) {
		
		return service.supprimer(id);
	}
	

    
}
