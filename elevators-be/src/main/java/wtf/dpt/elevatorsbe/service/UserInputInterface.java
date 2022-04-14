package wtf.dpt.elevatorsbe.service;

public interface UserInputInterface {

    void pressUp(int currentFloor);
    void pressDown(int currentFloor);
    void pressFloor(int targetFloor);
}
