import java.util.ArrayList;

public class StudyProgramme {

    private String name, description;
    private int semesters, maxITNs;
    private ArrayList<String> subjects = new ArrayList<>();

    public StudyProgramme(String name, String description, int semesters, int maxITNs) {
        this.name = name;
        this.description = description;
        this.semesters = semesters;
        this.maxITNs = maxITNs;
    }

    public String getName() {
        return name;
    }

    public int getMaxITNs() {
        return maxITNs;
    }

    public int getSemesters() {
        return semesters;
    }

    public String getDescription() {
        return description;
    }

    public void addSubject(String subject) {
        subjects.add(subject.toUpperCase());
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public boolean IsSubjectExist(String subject) {
        return subjects.contains(subject.toUpperCase());
    }
}
