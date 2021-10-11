import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {
    private Student student;
    private static List<Double> avgGrades = new ArrayList<>();

    public void enter(Student student){
        this.student = student;
        avgGrades.add(student.getAverageGrade());
    }

    public Double getHighestAverageGrade(){
        Double maxAvgGrade = Collections.max(avgGrades);
        return maxAvgGrade;
    }

}
