package Lab2.prob2A.prob2Amain;

import Lab2.prob2A.GradeReport;
import Lab2.prob2A.Student;

public class pro2AMain {

    public static void main(String [] args) {
        Student student = new Student("Ab");
        GradeReport gradeReport = student.getGradeReport();
        gradeReport.setGrade("A");
        System.out.println(student);
        System.out.println(gradeReport);

    }
}
