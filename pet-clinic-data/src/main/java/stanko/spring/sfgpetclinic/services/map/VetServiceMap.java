package stanko.spring.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import stanko.spring.sfgpetclinic.model.Specialty;
import stanko.spring.sfgpetclinic.model.Vet;
import stanko.spring.sfgpetclinic.services.SpecialitesService;
import stanko.spring.sfgpetclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
    private final SpecialitesService specialitesService;

    public VetServiceMap(SpecialitesService specialitesService) {
        this.specialitesService = specialitesService;
    }

    @Override
    public Vet findbyId(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Vet save(Vet object) {
        if(object.getSpecialtySet().size()>0){
            object.getSpecialtySet().forEach(specialty -> {
                if(specialty.getId() == null){
                    Specialty savedSpecialty = specialitesService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }


        return super.save(object);



    }
}
