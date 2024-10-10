package School.managment;

public class CourseManager {
    private Student [] students;

    public CourseManager() {
        this.students = new Student[0];
    }

    public void addStudent(Student newstudent) {
        Student [] updatedStudents = new Student[students.length + 1];

        for (int i = 0; i < students.length; i++) {
            updatedStudents[i] = students[i];
        }
        updatedStudents[students.length] = newstudent;

        this.students = updatedStudents;
    }

    public void displayAllStudents() {
        for (Student student : students) {
            student.displayDetails();
            System.out.println("_________________");
        }
    }
}
