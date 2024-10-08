package Managment;

import School.managment.Person;

import java.util.Arrays;

public class Student extends Person {

      private int studentID;
      private String[] enrolledCourses;
      private double tuition;

      public Student(String name, int age, int studentID){
          super(name, age);
          this.studentID = studentID;
          this.enrolledCourses = new String[0];
          this.tuition = 0.0;
      }

      public void enrollCourses(String [] courses){
          this.enrolledCourses = courses;
      }

      public void enrollCourses(String course){
          this.enrolledCourses = Arrays.copyOf(this.enrolledCourses, this.enrolledCourses.length+1);
          this.enrolledCourses[this.enrolledCourses.length-1] = course;


      }


    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
          this.studentID = studentID;
    }

    public String[] getEnrolledCourses() {
          return enrolledCourses;
    }

    public void setEnrolledCourses(String[] enrolledCourses) {
          this.enrolledCourses = enrolledCourses;
    }

    public double getTuition() {
          return tuition;
    }
    public void setTuition(double tuition) {
          this.tuition = tuition;

    }

    private void calculateTuition(){
          int numberOfCourses = this.enrolledCourses.length;
          setTuition(500 * numberOfCourses);

    }



}
