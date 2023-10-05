package opgave3;

import java.util.ArrayList;

public class Building {

    private ArrayList<Room> listB;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    Building(ArrayList <Room> listB, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding)
    {
        this.numberOfFloors = numberOfFloors;
        this.numberOfBathrooms = numberOfBathrooms;
        this.isOfficeBuilding = isOfficeBuilding;
        this.listB = listB;

    }

    public ArrayList<Room> getRooms() {
            return listB;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }
}
