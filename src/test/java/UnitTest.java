import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnitTest {

    //Get grade average test
    @Test
    public void getAvgTest(){
        List<Double> grades = new ArrayList<>();
        grades = Arrays.asList(5.0,2.0,8.0);
        String name = "Ama";
        Student std = new Student(name,grades, Level.SOPHOMORE);
        Double expectedAvg = 5.0;
        Assert.assertEquals(expectedAvg,std.getAverageGrade(),0.0);
    }

    //Get the highest average grade test
    @Test
    public void getHighestAverageGradeTest(){
        List<Double> s1Grades = new ArrayList<>();
        List<Double> s2Grades = new ArrayList<>();
        List<Double> s3Grades = new ArrayList<>();
        // 5, 4, 6
        String s1Name = "Ama";
        String s2Name = "Ken";
        String s3Name = "John";

        s1Grades = Arrays.asList(5.0,2.0,8.0);
        s2Grades = Arrays.asList(5.0,2.0,5.0);
        s3Grades = Arrays.asList(5.0,9.0,4.0);

        Student std1 = new Student(s1Name, s1Grades, Level.JUNIOR);
        Student std2 = new Student(s2Name, s2Grades, Level.FRESHMAN);
        Student std3 = new Student(s3Name, s3Grades,Level.SOPHOMORE);

        Lecture lecture = new Lecture();
        lecture.enter(std1);
        lecture.enter(std2);
        lecture.enter(std3);

        Double exepectValue = 6.0;

        Assert.assertEquals(exepectValue,lecture.getHighestAverageGrade(),0.0);
    }

    //Get the naughty student average grade test
    @Test
    public void naughtyStudentAvgTest(){
        List<Double> s1Grades = Arrays.asList(5.0,2.0,8.0);
        String s1Name = "Ama";
        NaughtyStudent student = new NaughtyStudent(s1Name, s1Grades, Level.SENIOR);
        Double expectedAvg = 5.5;
        Assert.assertEquals(expectedAvg,student.getAverageGrade(),0.0);

    }

    //Inserting a few Naughty student into lecture and
    //testing their average grade.
    @Test
    public void naughtyStudentInsertionTest(){

        List<Double> s1Grades = Arrays.asList(5.0,2.0,8.0);
        List<Double> nS1Grades = Arrays.asList(5.0,2.0,8.0);
        String s1Name = "Ama";
        String nS1Name = "Naut";
        Student std = new Student(s1Name,s1Grades,Level.SENIOR);
        NaughtyStudent nStd = new NaughtyStudent(nS1Name,nS1Grades,Level.JUNIOR);

        Lecture lecture = new Lecture();
        lecture.enter(std);
        lecture.enter(nStd);

        Assert.assertTrue("Naughty student average grade is greater than student average grade"
                ,nStd.getAverageGrade() > std.getAverageGrade());

    }

    //Get the names of Registered students test
    @Test
    public void getResgisterTest(){
        List<Double> s1Grades = Arrays.asList(5.0,2.0,8.0);
        List<Double> s2Grades = Arrays.asList(5.0,2.0,5.0);
        List<Double> s3Grades = Arrays.asList(5.0,9.0,4.0);
        // 5, 4, 6
        String s1Name = "Ama";
        String s2Name = "Ken";
        String s3Name = "John";

        Student std1 = new Student(s1Name, s1Grades, Level.SOPHOMORE);
        Student std2 = new Student(s2Name, s2Grades, Level.FRESHMAN);
        Student std3 = new Student(s3Name, s3Grades,Level.SOPHOMORE);
        List<Student> students = Arrays.asList(std1, std2, std3);
        Register register = new Register(students);
        //System.out.println(register.getRegisterByLevel(Level.SOPHOMORE));
        List<String> expectedNames = Arrays.asList(std1.getName(), std2.getName(), std3.getName());

        Assert.assertEquals(expectedNames,Register.getRegister());
    }

    //Student not found exception test
    @Test
    public void studentNotFoundExceptionTest() throws StudentNotFoundException {
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
        String expectedValue = "mus not found";
        System.out.println(register.studentByName("Ama"));
        //Assert.assertEquals(expectedValue, register.studentByName("mus"));
    }


}
