package Lab2.prob2A;

public class GradeReport {

    private String grade;
    private Student student;

     GradeReport(Student student) {
        this.student = student;
    }

    public String getGrade() {
         return grade;
    }

    public void setGrade(String grade) {
         this.grade = grade;
    }

    public String toString() {
        return  "The Student name is: " + student.getName() + " And it's Grade is: "+ this.grade;
    }
}
