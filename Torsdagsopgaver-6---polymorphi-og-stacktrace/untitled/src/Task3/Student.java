package Task3;

import java.util.ArrayList;

public class Student extends Person
{
    public ArrayList<String> passedCourses;
    public ArrayList<String> currentCourses;


    public Student(String name, ArrayList<String> passedCourses, ArrayList<String> currentCourses)
    {
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = currentCourses;
    }

    @Override
    public boolean addCourse(String course)
    {
        if(passedCourses.contains(course) || currentCourses.contains(course))
        {
            System.out.println("No");
            return false;
        }
        else
        {
            System.out.println("Yes");
            currentCourses.add(course);
            return true;


        }


    }
}
