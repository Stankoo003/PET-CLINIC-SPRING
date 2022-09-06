package stanko.spring.sfgpetclinic.services;

import stanko.spring.sfgpetclinic.model.Owner;
import stanko.spring.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {


    Vet findById(Long id);
    Vet save(Owner owner);
    Set<Owner> findAll();
}
