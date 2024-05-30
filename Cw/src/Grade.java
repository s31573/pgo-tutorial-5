public class Grade {

    String subjectName;
    int grade;

    Grade(String subjectName, int grade) {
        this.subjectName = subjectName;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public String getSubjectName() {
        return subjectName;
    }
}
