import java.util.ArrayList;


public class Teacher extends Person {

    ArrayList<String> currentCourses;
    ArrayList<String> canTeach;

    public Teacher(String name ) {
        super(name);
        this.canTeach = canTeach;

    }

    public static void setCourse(ArrayList<String> courses) {
    }


    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(course)){
            return false;
        }else {
            canTeach.add(course);
            return true;
        }
    }

}