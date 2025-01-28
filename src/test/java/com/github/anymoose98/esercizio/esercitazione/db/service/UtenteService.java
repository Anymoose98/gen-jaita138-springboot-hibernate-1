package com.github.anymoose98.esercizio.esercitazione.db.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.anymoose98.esercizio.esercitazione.db.entity.Utente;
import com.github.anymoose98.esercizio.esercitazione.db.repository.UtenteRepo;

@Service
public class UtenteService {
    @Autowired
    private UtenteRepo utenteRepo;

    // Mostra tutti gli utenti
    public List<Utente> findAll() {
        return utenteRepo.findAll();
    }

    // Salva o modifica un utente
    public void saveUtente(Utente utente) {
        utenteRepo.save(utente);
    }

    // Cancella un utente
    public void deleteUtente(Utente utente) {
        utenteRepo.delete(utente);
    }

    // Trova un utente per ID
    public Optional<Utente> findUtente(long id) {
        return utenteRepo.findById(id);
    }
}