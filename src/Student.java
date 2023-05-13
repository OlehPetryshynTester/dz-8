import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Student {
    private int id;
    private static int idCount;
    private String firstName;
    private String lastName;
    private List<String> doneTasks;

    public Student( String firstName, String lastName) {
        this.id = idCount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.doneTasks = new LinkedList<>();


    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void markTaskDone(String task) {
        if (!doneTasks.contains(task)) {
            doneTasks.add(task);
        }
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", doneTasks=" + doneTasks +
                '}';
    }
}
