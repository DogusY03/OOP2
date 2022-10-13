import java.util.ArrayList;

public class Student extends Person {

    ArrayList<String> passedCourses;
    ArrayList<String> currentCourses;

    public Student(String name) {

        super (name);

        this.currentCourses = passedCourses;
    }

    public static void setCourse(ArrayList<String> courses) {
    }


    @Override
    public boolean addCourse(String course) {
        if (passedCourses.contains(course)){
            return false;
        }else {
            passedCourses.add(course);
            return true;
        }
    }
}
