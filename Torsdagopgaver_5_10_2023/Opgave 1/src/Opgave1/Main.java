package Opgave1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        ArrayList <Customer> COS = new ArrayList<>();
        COS.add(new Customer("Sander" , "Christensen", "SC"));
        COS.add(new Customer("Jens" , "Peter", "JP"));
        COS.add(new Customer("Anne" , "Hansen", "AH"));

        System.out.println(COS);



    }


    public static void printCustomers(ArrayList <Customer> COS)
    {
      for(Customer customer: COS)
      {
          System.out.println(COS);
      }



    }




}
