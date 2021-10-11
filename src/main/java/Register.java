import java.util.*;
import java.util.stream.Collectors;

public class Register {
    static List<Student> students;
    public Register(List<Student> students){
        this.students = students;
    }

    public static List<String> getRegister(){
        List<String> names = students.stream().map(student -> student.getName()).collect(Collectors.toList());
//        List<String> names = new ArrayList<>();
//        for(Student student : students ){
//            names.add(student.getName());
//        }
        return names;
    }

    public Map<Level, List<Student>> getRegisterByLevel(Level level){
        Map<Level, List<Student>> studentByLevel = new HashMap<>();
        List<Student> studentsList = students.stream().filter(student -> student.getLevel()==level).collect(Collectors.toList());
        studentByLevel.put(level, studentsList);

        //Map<Level, List<Student>> studentByLevel = new HashMap<>();
//        for (Student student: students){
//            if (student.getLevel() == level ){
//                    List<Student> studentList = studentByLevel.getOrDefault(level,new ArrayList<>());
//                    studentList.add(student);
//                    studentByLevel.put(level, studentList);
//            }
//
//        }
        return studentByLevel;
    }

//    public static String printReport(){
//
//    }

    public List<Student> sort(Comparator sortByName){
        Collections.sort(students, sortByName);
        return students;
    }

    public Student studentByName(String name) throws StudentNotFoundException{
                Student std = students.stream()
                .map(student -> (student.getName() == name ? student : null ))
                .collect(Collectors.toList())
                .get(0);
        if(std != null){
            return std;
        }
        throw new StudentNotFoundException(name + " not found");
    }

    Double highestGrade(Student student){
        return student.doubleGrades().max().getAsDouble();
    }

    Double allGradesAvg(Student student){
        return student.getAverageGrade();
    }

    List<Double> moreThan60PercentGrades(Student student){
        //Double percentGrade = student.getAverageGrade() * 0.6;
        return student.getGrades().stream().filter(grade -> grade > 6).collect(Collectors.toList());
    }

}
