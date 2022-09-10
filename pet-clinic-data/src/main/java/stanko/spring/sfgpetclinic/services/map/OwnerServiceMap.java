package stanko.spring.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import stanko.spring.sfgpetclinic.model.Owner;
import stanko.spring.sfgpetclinic.services.CrudServices;
import stanko.spring.sfgpetclinic.services.OwnerService;
import stanko.spring.sfgpetclinic.services.map.AbstractMapService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {

    @Override
    public Owner findbyId(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
