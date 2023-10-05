package Opgave2;

import java.util.ArrayList;

public class Main {

    public static void main (String[] args)
    {
        //ArrayList<String> coffeeMenu = new ArrayList<>();
        Cafe kaffe = new Cafe();
        kaffe.loadMenuData();

        for(String coffeItem : kaffe.coffeeMenu)
        {
            System.out.println(coffeItem);
        }


    }
}
