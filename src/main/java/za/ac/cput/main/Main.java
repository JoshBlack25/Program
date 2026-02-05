package za.ac.cput.main;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Employee employee1 = new Employee(
                1,
                "John",
                "Doe",
                "Male",
                "123 Main Street, Cape Town"
        );

        // Print the employee details
        System.out.println(employee1);
    }
}
