import java.util.List;

public class NaughtyStudent extends Student{
    NaughtyStudent(String name,List<Double> grade, Level level){
        super(name, grade, level);
    }
    @Override
    public Double getAverageGrade(){
        List<Double> grades = getGrades();
        Double sum = 0.0;
        for(Double grade: grades){
            sum += grade;
        }
        Double avgGrade = sum/ grades.size();
        Double increment = (sum/ grades.size()) * 0.1;
        Double naughtyAvg = avgGrade + increment;
        return naughtyAvg;
    }
}
