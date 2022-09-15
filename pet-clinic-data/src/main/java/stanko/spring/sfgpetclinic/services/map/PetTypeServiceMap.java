package stanko.spring.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import stanko.spring.sfgpetclinic.model.Owner;
import stanko.spring.sfgpetclinic.model.PetType;
import stanko.spring.sfgpetclinic.services.PetTypeService;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType,Long>implements PetTypeService{
    @Override
    public PetType findbyId(Long aLong) {
        return super.findById(aLong);
    }
}
