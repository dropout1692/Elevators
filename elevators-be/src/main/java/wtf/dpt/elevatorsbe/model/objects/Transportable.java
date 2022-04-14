package wtf.dpt.elevatorsbe.model.objects;

import java.util.UUID;

public abstract class Transportable implements Moveable {

    String uuid;

    public Transportable(){
        this.uuid = UUID.randomUUID().toString();
    }
}
