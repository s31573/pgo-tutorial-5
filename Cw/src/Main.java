import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("John", "Doe", "doe@wp.pl", "Warsaw, Zlota 12", "333-322-222", new Date(1980, 1,1));
        Student student2 = new Student("John", "Doe2", "doe@wp.pl", "Warsaw, Zlota 12", "333-322-222", new Date(1980, 1,1));

        StudyProgramme it = new StudyProgramme("IT", "AAA", 7, 5);

        it.addSubject("PGO");
        it.addSubject("APBD");

        student.enrollStudent(it);
        student2.enrollStudent(it);

        student.addGrade(5, "PGO");
        student.addGrade(4, "PGO");
        student.addGrade(1, "PGO");
        student.addGrade(2, "APBD");

        student2.addGrade(3, "PGO");

        Students.displayAllStudentsGradesFromSubject("PGO");

        Students.promoteAllStudents();

        Students.displayInfoAboutAllStudents();

    }

}