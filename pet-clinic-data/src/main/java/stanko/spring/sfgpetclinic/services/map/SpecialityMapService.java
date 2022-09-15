package stanko.spring.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import stanko.spring.sfgpetclinic.model.Specialty;
import stanko.spring.sfgpetclinic.services.SpecialitesService;

@Service
public class SpecialityMapService extends AbstractMapService<Specialty,Long> implements SpecialitesService{
    @Override
    public Specialty findbyId(Long aLong) {
        return super.findById(aLong);
    }
}
