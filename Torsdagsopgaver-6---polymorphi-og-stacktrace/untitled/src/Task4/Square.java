package Task4;

public class Square implements Shape {

    private double length;
    private double width;



    Square(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    @Override

    public Double getDouble()
    {
        double sum = this.length + this.width;

        return sum;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
