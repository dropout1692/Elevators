package wtf.dpt.elevatorsbe.model.structures;

import wtf.dpt.elevatorsbe.model.objects.Transportable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Floors {

    private int floorCount;
    private Map<Integer, List<Transportable>> contents;

    public Floors(int maxFloor){

        this.floorCount = maxFloor+1;

        Map<Integer, List<Transportable>> contentsMap = new HashMap<>();
        for(int i=0; i<=maxFloor; i++){
            contentsMap.put(i, new ArrayList<>());
        }
        this.contents = contentsMap;
    }
}
