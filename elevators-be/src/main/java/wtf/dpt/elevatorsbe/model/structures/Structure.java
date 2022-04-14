package wtf.dpt.elevatorsbe.model.structures;

import java.util.UUID;

public abstract class Structure {

    String uuid;

    public Structure(){
        this.uuid = UUID.randomUUID().toString();
    }
}
