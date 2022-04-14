package wtf.dpt.elevatorsbe.model.objects;

import lombok.Getter;
import lombok.Setter;
import wtf.dpt.elevatorsbe.model.structures.Structure;
import wtf.dpt.elevatorsbe.util.NameGenerator;

@Getter
@Setter
public class Person extends Transportable {

    private String name;

    public Person() {
        super();
        this.name = NameGenerator.get();
    }

    @Override
    public void getIn(Structure elevator) {

    }

    @Override
    public void getOut() {

    }
}
