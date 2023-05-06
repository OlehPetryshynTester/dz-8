import java.util.ArrayList;
import java.util.List;

public class GroupWithTask extends Student implements iStudentGrouptable, iTaskListable {
    private List<Student> students = new ArrayList<>();
    private List<String> tasks = new ArrayList<>();
    private Student groupLeader;

    public GroupWithTask(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public void markTaskDone(Student student, String task) {
        if (students.contains(student) && tasks.contains(task)) {
            student.markTaskDone(task);
        }
    }

    public Student getGroupLeader() {
        return groupLeader;
    }

    public void setGroupLeader(Student groupLeader) {
        if (students.contains(groupLeader)) {
            this.groupLeader = groupLeader;
        }
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void renameStudent(Student student, String firstName, String lastName) {
        if (students.contains(student)) {
            student.setFirstName(firstName);
            student.setLastName(lastName);
        }
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    @Override
    public void markTaskAsDone(Student student, String task) {

    }

    public void removeTask(String task) {
        tasks.remove(task);
    }

    public List<String> getTasks() {
        return new ArrayList<>(tasks);
    }


    @Override
    public void markTaskDone(String task) {

    }
}
