package com.github.anymoose98.esercizio.esercitazione.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.anymoose98.esercizio.esercitazione.db.entity.Utente;

@Repository
public interface UtenteRepo extends JpaRepository<Utente, Long> {

}
