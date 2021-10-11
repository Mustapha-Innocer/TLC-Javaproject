import javax.lang.model.element.Name;
import java.util.List;
import java.util.stream.DoubleStream;

public class Student implements NameAble, HasLevel {
    private List<Double> grades;
    private String name;
    private Level level;

    public Student(String name, List<Double> grade, Level level){
        this.grades = grade;
        this.name = name;
        this.level = level;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public Double getAverageGrade(){
        Double sum = 0.0;
        for(Double grade: grades){
            sum += grade;
        }
        return sum/ grades.size();
    }

    DoubleStream doubleGrades(){
        return grades.stream().mapToDouble(grade -> grade);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Level getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grades=" + grades +
                ", name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
