package be.intecbrussel.petclinic.services;

import be.intecbrussel.petclinic.model.Vet;
import java.util.Set;

public interface VetService {

    Vet findById(Long Id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}