package Opgave1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        ArrayList <Customer> COS = new ArrayList<>();
        COS.add(new Customer("Sander" , "Christensen", "Iceboy"));
        printCustomers(COS);



    }


    public static void printCustomers(ArrayList <Customer> COS)
    {
      for(Customer customer: COS)
      {
          System.out.println(COS);
      }



    }




}
