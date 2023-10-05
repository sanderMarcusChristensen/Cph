package opgave3;

public class Room {

    private int nummberOfDoors;
    private int nummberOfLamps;
    private int nummberOfWindows;

    Room(int nummberOfDoors, int nummberOfLamps, int nummberOfWindows)
    {
        this.nummberOfDoors = nummberOfDoors;
        this.nummberOfLamps = nummberOfLamps;
        this.nummberOfWindows = nummberOfWindows;
    }

    public int getNummberOfDoors()
    {
        return nummberOfDoors;
    }

    public int getNummberOfLamps() { return nummberOfLamps; }

    public int getNummberOfWindows() { return nummberOfWindows; }




}
