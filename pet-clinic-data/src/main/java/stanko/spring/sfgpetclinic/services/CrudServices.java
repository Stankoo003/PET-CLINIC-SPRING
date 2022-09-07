package stanko.spring.sfgpetclinic.services;

import java.util.Set;

public interface CrudServices <T,ID>{

    Set<T> findAll();
    T findbyId(ID id);
    T save(T object);

    void delete(T object);
    void deleteById(ID id);


}
