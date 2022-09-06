package stanko.spring.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    private Long id; // preporucljivo da budu box type. jer oni mogu biti null a primitivni ne mogu.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
