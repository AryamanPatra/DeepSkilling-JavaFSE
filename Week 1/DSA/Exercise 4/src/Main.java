class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

        // Adding employees
        ems.addEmployee(new Employee(1, "Alice", "Developer", 70000));
        ems.addEmployee(new Employee(2, "Bob", "Designer", 60000));
        ems.addEmployee(new Employee(3, "Charlie", "Manager", 80000));

        // Traversing employees
        System.out.println("All Employees:");
        ems.traverseEmployees();

        // Searching for an employee
        System.out.println("\nSearch for Employee with ID 2:");
        Employee emp = ems.searchEmployee(2);
        if (emp != null) {
            System.out.println(emp);
        } else {
            System.out.println("Employee not found.");
        }

        // Deleting an employee
        System.out.println("\nDeleting Employee with ID 2");
        ems.deleteEmployee(2);

        // Traversing employees after deletion
        System.out.println("All Employees after deletion:");
        ems.traverseEmployees();
    }    
}
