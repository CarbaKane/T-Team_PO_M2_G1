package com.team_po_g1.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.team_po_g1.model.Administrateur;

import java.util.Optional;

@Repository
public interface AdministrateurRepository extends JpaRepository<Administrateur, Long> {
    Administrateur findByEmail(String email);
}
