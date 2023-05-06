
public class Main {
    public static void main(String[] args) {
        // create some students
        Student student1 = new GroupWithTask(1, "John", "Smith");
        Student student2 = new GroupWithTask(2, "Jane", "Doe");
        Student student3 = new GroupWithTask(3, "Bob", "Marly");
        Student student4 = new GroupWithTask(3, "Don", "Digidon");

        // create a group with tasks
        GroupWithTask group = new GroupWithTask(1, "Engineering", "101");
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.setGroupLeader(student1);
        group.addTask("Assignment 1");
        group.addTask("Assignment 2");
        group.removeTask("Assignment 2");

        // mark tasks as done
        group.markTaskDone(student1, "Assignment 1");
        group.markTaskDone(student2, "Assignment 1");
        group.markTaskDone(student3, "Assignment 2");
        group.renameStudent(student4,"Don","Carlion");
        group.removeStudent(student2);


        // print out the tasks for the group
        System.out.println("Tasks for " + group.getFirstName() + "'s group: " + group.getLastName());
        for (String task : group.getTasks()) {
            System.out.println("- " + task);
        }

        // print out the students in the group
        System.out.println("Students in " + group.getFirstName() + "'s group: " + group.getLastName());
        for (Student student : group.getStudents()) {
            System.out.println("- " + student.getFirstName() + " " + student.getLastName());

        }


        // print out the group leader
        System.out.println(group.getFirstName() + "'s group leader is " + group.getGroupLeader().getFirstName() + " " + group.getGroupLeader().getLastName());



    }
}