package opgave3;

import java.util.ArrayList;

public class Main {

    public static void main (String[] args)
    {
        Room R1 = new Room(1,2,3);
        Room R2 = new Room(2,3,4);
        Room R3 = new Room(3,4,5);

        ArrayList<Room> listR = new ArrayList<>();

        listR.add(R1);
        listR.add(R2);
        listR.add(R3);


        Building B1 = new Building(listR, 1, 1, true);

        System.out.println(countLampsInBuilding(B1));
        System.out.println(isNormal(B1));


    }

    public static int countLampsInBuilding(Building build)
    {
        int sum = 0;

        for(Room room : build.getRooms())
        {
            int numLamps = room.getNummberOfLamps();
            sum = sum + numLamps;
            //sum += numLamps;
        }

        return sum;
    }


    public static boolean isNormal(Building build)
    {
        if(build.getNumberOfFloors() < build.getRooms().size() )
        {
            return true;

        }
        else
        {
            System.out.println("OH HEL NAH");
            return false;

        }
    }

}
