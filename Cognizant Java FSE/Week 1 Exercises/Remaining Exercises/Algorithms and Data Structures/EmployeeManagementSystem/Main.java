public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5); 

        manager.addEmployee(new Employee(1, "Alice", "Manager", 80000));
        manager.addEmployee(new Employee(2, "Bob", "Developer", 60000));
        manager.addEmployee(new Employee(3, "Charlie", "Designer", 55000));

        System.out.println("\n All Employees:");
        manager.displayAll();

        System.out.println("\n Searching for Employee with ID 2:");
        Employee found = manager.searchEmployee(2);
        if (found != null) {
            found.display();
        } else {
            System.out.println("Not found.");
        }

        System.out.println("\n Deleting Employee with ID 2:");
        manager.deleteEmployee(2);

        System.out.println("\n Updated Employees:");
        manager.displayAll();
    }
}
