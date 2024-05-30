import java.util.ArrayList;

public class Students {

    private static int lastIndex = 1;

    private static ArrayList<Student> students = new ArrayList<>();

    public static int newIndex(){
        return lastIndex++;
    }

    public static void addStudent(Student s){
        students.add(s);
    }


    public static void promoteAllStudents(){
        for(Student student : students){
            student.promoteToNextSemester();
        }
    }

    public static void displayInfoAboutAllStudents(){
        for(Student student : students){
            System.out.println(String.format("%s %s (%s): status[%s] program[%s] semestr[%s]", student.getFirstname(), student.getLastname(), student.getIndex(),student.getStatus().name, student.getProgramme()==null ? "brak" : student.getProgramme().getName(), student.getSemester()));
        }
    }

    public static void displayAllStudentsGradesFromSubject(String subject){
        System.out.println("========== OCENY: " + subject + " ==========");
        System.out.println(" ");
        for(Student student : students){
            if(student.getStatus() == StudentStatus.STUDENT){
                if(student.getProgramme().IsSubjectExist(subject)){
                    System.out.println(String.format("%s %s", student.getIndex(), student.getGradesFromSubject(subject).toString()));
                }
            }
        }
        System.out.println(" ");
        System.out.println("======================================");
    }

}
