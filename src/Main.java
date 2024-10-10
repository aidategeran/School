import Managment.Student;
import School.managment.CourseManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Aida", 33,345678);
        Student student2 = new Student("Bob", 23, 345688);
        Student student3 = new Student("John", 23, 345689);
        Student student4 = new Student("Jane", 23, 345690);

       student.enrollCourses( new String [] {"Math","Physics"});
       student2.enrollCourses( new String [] {"Math","Physics","Computer Science"});
       student3.enrollCourses( "Physics");
       student4.enrollCourses( "Computer Science");


        CourseManager courseManager = new CourseManager();

        courseManager.addStudent(student);
        courseManager.addStudent(student2);
        courseManager.addStudent(student3);
        ;
}
}