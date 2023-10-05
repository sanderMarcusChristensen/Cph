package Opgave2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    public ArrayList<String> coffeeMenu = new ArrayList<>();



    public void loadMenuData()
    {
        File file = new File("coffees.txt");
        try
        {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine())
            {
                String input = scanner.nextLine();
                coffeeMenu.add(input);

            }

        } catch (FileNotFoundException e)
        {
            System.out.println("filen findes ikke");
        }
    }


    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }


}
