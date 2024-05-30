import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Student {

    private String index, firstname, lastname, email, address, phone;
    private Date dob;
    private StudentStatus status;
    private StudyProgramme programme;
    private int semester = 0;
    private int ITNs = 0;
    private ArrayList<Grade> grades = new ArrayList<>();

    Student(String firstname, String lastname, String email, String address, String phone, Date dob){
        this.index = "s" + Students.newIndex();
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.dob = dob;
        this.status = StudentStatus.CANDIDATE;
        Students.addStudent(this);
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public StudyProgramme getProgramme() {
        return programme;
    }

    public int getSemester() {
        return semester;
    }

    public int getITNs() {
        return ITNs;
    }

    public String getAddress() {
        return address;
    }

    public Date getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getIndex() {
        return index;
    }

    public StudentStatus getStatus() {
        return status;
    }

    public void enrollStudent(StudyProgramme programme){
        if(this.status != StudentStatus.CANDIDATE){return;}
        this.programme = programme;
        this.status = StudentStatus.STUDENT;
        this.semester = 1;
    }

    public void promoteToNextSemester(){
        if(this.status!=StudentStatus.STUDENT)return;
        if(this.ITNs>programme.getMaxITNs())return;
        if(this.semester + 1 > this.programme.getSemesters()){
            this.status = StudentStatus.GRADUATE;
            return;
        }
        this.semester++;


    }

    public void addGrade(int grade, String subject){
        if(this.status!=StudentStatus.STUDENT)return;
        if(!this.programme.IsSubjectExist(subject))return;
        this.grades.add(new Grade(subject, grade));
    }

    public ArrayList<Integer> getGradesFromSubject(String subject) {
        ArrayList<Integer> gradesResult = new ArrayList<>();
        for(Grade grade : grades){
            if(grade.getSubjectName().equals(subject.toUpperCase())){
                gradesResult.add(grade.getGrade());
            }
        }
        return gradesResult;
    }

}
