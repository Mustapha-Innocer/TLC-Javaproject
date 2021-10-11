import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Double> s1Grades = Arrays.asList(5.0,2.0,8.0);
        List<Double> s2Grades = Arrays.asList(5.0,2.0,5.0);
        List<Double> s3Grades = Arrays.asList(5.0,9.0,4.0);
        List<Double> nS1Grades = Arrays.asList(5.0,2.0,8.0);
        // 5, 4, 6
        String s1Name = "Ama";
        String s2Name = "Ken";
        String s3Name = "John";
        String nS1Name = "Naut";

        Student std1 = new Student(s1Name, s1Grades, Level.SOPHOMORE);
        Student std2 = new Student(s2Name, s2Grades, Level.FRESHMAN);
        Student std3 = new Student(s3Name, s3Grades,Level.SOPHOMORE);
        NaughtyStudent nStd = new NaughtyStudent(nS1Name,nS1Grades,Level.JUNIOR);
        List<Student> students = Arrays.asList(std2, std3, std1, nStd);
        Register register = new Register(students);
        //System.out.println(Register.getRegisterByLevel(Level.SOPHOMORE).get(Level.SOPHOMORE));
        //List<String> expectedNames = Arrays.asList(std1.getName(), std2.getName(), std3.getName());

//        try {
//            System.out.println(register.studentByName("Ken"));
//        } catch (StudentNotFoundException e) {
//            System.out.println(e.getMessage());
//        }

        System.out.println(register.moreThan60PercentGrades(std1));
    }
}
