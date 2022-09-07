package stanko.spring.sfgpetclinic.services.map;

import stanko.spring.sfgpetclinic.model.Owner;
import stanko.spring.sfgpetclinic.services.CrudServices;
import stanko.spring.sfgpetclinic.services.map.AbstractMapService;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudServices<Owner,Long> {

    @Override
    public Owner findbyId(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }
}
