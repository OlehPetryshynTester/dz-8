import java.util.List;

public interface iTaskListable {
    void addTask(String task);
    void removeTask(String task);
    List<String> getTasks();
}
