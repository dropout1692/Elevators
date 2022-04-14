package wtf.dpt.elevatorsbe.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import wtf.dpt.elevatorsbe.model.structures.Elevator;
import wtf.dpt.elevatorsbe.model.structures.Floors;

import java.util.List;

@Getter
@Setter
@Component
@Scope("prototype")
public class BuildingState {

    private Floors floors;
    private List<Elevator> elevators;
}
