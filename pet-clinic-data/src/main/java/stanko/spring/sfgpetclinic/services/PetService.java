package stanko.spring.sfgpetclinic.services;

import stanko.spring.sfgpetclinic.model.Owner;
import stanko.spring.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Owner owner);
    Set<Owner> findAll();
}
