package stanko.spring.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import stanko.spring.sfgpetclinic.model.Pet;
import stanko.spring.sfgpetclinic.services.CrudServices;
import stanko.spring.sfgpetclinic.services.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Pet findbyId(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Pet save(Pet object) {
        return super.save( object);
    }

}
