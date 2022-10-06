import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered ? ");
        int quantityRoom = sc.nextInt();
        int id;
        int idSalary;
        double salary;
        int idIncreaseSalary = 0;
        String name;

        Employee[] employeesVetor = new Employee[quantityRoom];

        for (int i = 0; i < quantityRoom; i++) {
            System.out.println("Emplyoee #" + (i + 1));

            System.out.print("Id: ");
            id = sc.nextInt();

            sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();

            System.out.print("Salary: ");
            salary = sc.nextInt();

            employeesVetor[i] = new Employee(id, name, salary);
        }
        System.out.println();
        System.out.print("Enter the employee id that will have salary increase ? ");
        idSalary = sc.nextInt();
        for (Employee Employee : employeesVetor) {
            if (idSalary == Employee.getId()) {
                System.out.print("Enter the percentage ? ");
                Employee.increaseSalary(sc.nextInt());
                idIncreaseSalary = Employee.getId();
            }
        }
        if (idSalary != idIncreaseSalary){
            System.out.println("this id does not exist!");
        }
        System.out.println();
        System.out.println("List of employees: ");
        for (Employee employee : employeesVetor) {
            System.out.print(employee);
        }
        sc.close();
    }
}
