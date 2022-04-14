package wtf.dpt.elevatorsbe.model.structures;

import lombok.Getter;
import wtf.dpt.elevatorsbe.model.objects.Transportable;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Elevator {

    private int currentFloor;
    private List<Transportable> contents;

    public Elevator() {
        this.contents = new ArrayList<>();
    }
}
