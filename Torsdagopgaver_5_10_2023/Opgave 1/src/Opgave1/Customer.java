package Opgave1;

public class Customer
{

    private String firstName;
    private String lastName;
    private String userName;
    int ID;

    Customer(String firstName, String lastName, String userName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getUserName()
    {
       return userName;
    }


    public String toString()
    {
        return firstName + " " + lastName + " " + userName;
    }



}
