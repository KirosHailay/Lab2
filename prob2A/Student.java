package Lab2.prob2A;

import Lab2.prob2A.GradeReport;

public class Student {
    private  String name;
    GradeReport gradeReport;

  public   Student(String name) {
        gradeReport = new GradeReport(this);
        this.name = name;

    }

    public GradeReport getGradeReport() {
        return gradeReport;
    }

    public String getName(){
      return name;
    }

    public String toString() {
        return  "The Student name is: " + this.getName() + " And it's Grade is: "+ gradeReport.getGrade();
    }
}
