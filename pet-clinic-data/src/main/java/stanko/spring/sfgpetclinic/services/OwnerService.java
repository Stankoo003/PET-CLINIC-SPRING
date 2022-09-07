package stanko.spring.sfgpetclinic.services;

import stanko.spring.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudServices<Owner,Long>{
    Owner findByLastName(String lastName);

}
