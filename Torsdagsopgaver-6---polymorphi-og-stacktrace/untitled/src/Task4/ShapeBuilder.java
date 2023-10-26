package Task4;

import java.util.ArrayList;

public class ShapeBuilder
{

    ArrayList<Shape> List = new ArrayList<>();

    public void addShape(Shape shape)
    {
        List.add(shape);

    }

    public double getTotalArea(ArrayList<Shape> List)
    {
        double sum = 0;
        for(Shape s: List)
        {
            sum += s.getDouble();

        }
        return sum;

    }


}
