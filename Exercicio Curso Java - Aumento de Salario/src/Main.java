import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered ? ");
        int qtdQuartos = sc.nextInt();
        int id;
        double salary;
        int idSalary;
        double porcentage;
        double totalPorcentage;
        String name;

        Funcionario[] employeesVetor = new Funcionario[qtdQuartos];

        for (int i = 0; i < qtdQuartos; i++) {
            System.out.println("Emplyoee #" + (i + 1));
            sc.nextLine();
            System.out.print("Id: ");
            id = sc.nextInt();

            sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();

            System.out.print("Salary: ");
            salary = sc.nextInt();

            employeesVetor[i] = new Funcionario(id, name, salary);

        }
        System.out.print("Enter the employee id that will have salary increase ? ");
        idSalary = sc.nextInt();
        for (Funcionario funcionario : employeesVetor) {
            if (idSalary == funcionario.getId()) {
                System.out.print("Enter the percentage ? ");
                porcentage = sc.nextInt();
                totalPorcentage = (funcionario.getSalary() * porcentage) / 100;
                funcionario.setSalary(funcionario.getSalary() + totalPorcentage);
            } else {
                System.out.print("wrong employee id ! ");
            }
        }
        System.out.println();
        System.out.println("List of employees: ");
        for (Funcionario funcionario : employeesVetor) {
            System.out.println(funcionario);
        }
    }
}
