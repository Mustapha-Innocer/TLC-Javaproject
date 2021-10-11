import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> grades = new ArrayList<>();
        grades = Arrays.asList(5.0,2.0,8.0);
        Student std = new Student("Mus", grades, Level.JUNIOR);
       // System.out.println(std.getLevel());

        Bag<Student> students = new Bag<>();
        students.add(std);
        students.add(std);
        //students.clear();
        for(Student student : students){
            System.out.println(student);
        }

    }
}
