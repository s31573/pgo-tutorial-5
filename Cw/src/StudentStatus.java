public enum StudentStatus {
    CANDIDATE(0, "candidate"),
    STUDENT(1, "student"),
    GRADUATE(2, "graduate");

    final int statusNo;
    final String name;

    StudentStatus(int i, String name) {
        statusNo = i;
        this.name = name;
    }
}
