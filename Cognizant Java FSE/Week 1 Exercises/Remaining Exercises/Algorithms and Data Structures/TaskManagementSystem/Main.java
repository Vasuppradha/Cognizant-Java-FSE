public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addTask(new Task(1, "Design UI", "Pending"));
        manager.addTask(new Task(2, "Write Backend", "In Progress"));
        manager.addTask(new Task(3, "Testing", "Pending"));

        System.out.println("\n All Tasks:");
        manager.displayTasks();

        System.out.println("\n Searching for Task ID 2:");
        Task task = manager.searchTask(2);
        if (task != null) {
            task.display();
        } else {
            System.out.println("Task not found.");
        }

        System.out.println("\n Deleting Task ID 2:");
        manager.deleteTask(2);

        System.out.println("\n Tasks After Deletion:");
        manager.displayTasks();
    }
}
