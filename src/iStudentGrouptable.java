import java.util.List;

public interface iStudentGrouptable {
    Student getGroupLeader();
    void setGroupLeader(Student groupLeader);
    List<Student> getStudents();
    void addStudent(Student student);
    void removeStudent(Student student);
    void renameStudent(Student student, String firstName, String lastName);
    void addTask(String task);
    void markTaskAsDone(Student student, String task);
}
