package Task4;

public class Circle implements Shape{


    private double c;

    Circle(double c)
    {
        this.c = c;
    }


    @Override
    public Double getDouble()
    {
        double sum = 3.14 *(c * c);

        return sum;
    }


    public double getC() {
        return c;
    }
}
