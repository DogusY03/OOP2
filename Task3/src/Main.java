import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Mathematics");
        courses.add ("Science");
        courses.add("English");
        courses.add("History");
        courses.add("Biology");

        ArrayList<Person> Persons = new ArrayList<>();

        ArrayList<Person> Teachers = new ArrayList<>();
        Teacher teacher = new Teacher("Signe");

        ArrayList<Person> Students = new ArrayList<>();
        Student student = new Student ("Dogus");
        Student student2 = new Student ("Andreas");



        Teacher.setCourse(courses);
        Student.setCourse(courses);

    }
}