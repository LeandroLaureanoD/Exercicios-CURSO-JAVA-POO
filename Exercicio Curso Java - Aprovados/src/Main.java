import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int qtdElementos = sc.nextInt();

        String[] nome = new String[qtdElementos];
        double[] nota1 = new double[qtdElementos];
        double[] nota2 = new double[qtdElementos];
        String[] aprovadosNome = new String[qtdElementos];

        for (int i = 0; i < qtdElementos; i++) {
            sc.nextLine();
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "º" + " aluno");
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();

            System.out.print("Primeira nota: ");
            nota1[i] = sc.nextDouble();

            System.out.print("Segunda nota: ");
            nota2[i] = sc.nextDouble();
            double avg = (nota1[i] + nota2[i]) / 2;
            if (avg >= 6) {
                aprovadosNome[i] = nome[i];
            }
        }
        System.out.println();
        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < aprovadosNome.length; i++) {
            if (aprovadosNome[i] != null){
                System.out.println(aprovadosNome[i]);
            }
        }
    }
}
