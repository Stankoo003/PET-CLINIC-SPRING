package stanko.spring.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import stanko.spring.sfgpetclinic.model.Vet;
import stanko.spring.sfgpetclinic.services.CrudServices;
import stanko.spring.sfgpetclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
    @Override
    public Vet findbyId(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }
}
