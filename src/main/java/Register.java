import java.util.ArrayList;
import java.util.List;

public class Register {
    static List<Student> students;
    public Register(List<Student> students){
        this.students = students;
    }

    public static List<String> getRegister(){
        List<String> names = new ArrayList<>();
        for(Student student : students ){
            names.add(student.getName());
        }
        return names;
    }

    public static List<String> getRegisterByLevel(Level level){
        List<String> names = new ArrayList<>();
        for (Student student : students){
            if (student.getLevel() == level){
                names.add(student.getName());
            }
        }
        return names;
    }
//    public static String printReport(){
//
//    }
}
