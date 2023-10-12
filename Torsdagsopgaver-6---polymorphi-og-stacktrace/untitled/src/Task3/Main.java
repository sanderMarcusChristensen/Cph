package Task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<String> passedCourses = new ArrayList<String>();
        passedCourses.add("Mat");

        ArrayList<String> currentCourses = new ArrayList<String>();
        currentCourses.add("Tysk");

        Student s1 = new Student("Jens",passedCourses, currentCourses);

        System.out.println(s1.addCourse("mat"));



        ArrayList<String> canTeach = new ArrayList<String>();
        canTeach.add("Mat");
        canTeach.add("Tysk");

        ArrayList<String> currentCoursesT = new ArrayList<String>();
        currentCoursesT.add("Story");

        Teacher T1 = new Teacher("Nanna", canTeach, currentCoursesT);

        System.out.println(T1.addCourse("Mat"));

        ArrayList<Person> person = new ArrayList<>();
        person.add(new Teacher("Anne", new ArrayList<>(), new ArrayList<>()));
        person.add(new Student("Sander", new ArrayList<>(), new ArrayList<>()));















    }
}
