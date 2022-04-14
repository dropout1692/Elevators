package wtf.dpt.elevatorsbe.model.objects;

import wtf.dpt.elevatorsbe.model.structures.Structure;

public interface Moveable {

    void getIn(Structure elevator);
    void getOut();
}
