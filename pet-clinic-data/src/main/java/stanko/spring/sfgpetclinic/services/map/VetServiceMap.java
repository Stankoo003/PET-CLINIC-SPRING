package stanko.spring.sfgpetclinic.services.map;

import stanko.spring.sfgpetclinic.model.Vet;
import stanko.spring.sfgpetclinic.services.CrudServices;
import stanko.spring.sfgpetclinic.services.VetService;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements CrudServices<Vet,Long> {
    @Override
    public Vet findbyId(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }
}
