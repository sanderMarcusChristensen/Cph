package Task3;

import java.util.ArrayList;

public class Teacher extends Person {
    public ArrayList<String> canTeach;
    public ArrayList<String> currentCoursesT;


    public Teacher(String name, ArrayList<String> canTeach, ArrayList<String> currentCoursesT) {
        super(name);
        this.canTeach = canTeach;
        this.currentCoursesT = currentCoursesT;

    }

    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(course) && !currentCoursesT.contains(course)) {
            currentCoursesT.add(course);
            System.out.println("yessir");
            return true;
        }

        return false;


    }

}

