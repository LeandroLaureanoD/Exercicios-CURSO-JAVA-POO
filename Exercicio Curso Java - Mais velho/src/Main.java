import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int qtdElementos = sc.nextInt();

        String[] nome = new String[qtdElementos];
        int[] idade = new int[qtdElementos];

        for (int i = 0; i < qtdElementos; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + "º" + " pessoa");
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();

            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }
        int pessoaMaisVelha = 0;
        String nomePessoaMaisVelha = "";

        for (int i = 0; i < qtdElementos; i++) {
            if (idade[i] > pessoaMaisVelha){
                pessoaMaisVelha = idade[i];
                nomePessoaMaisVelha = nome[i];
            }
        }
        System.out.print("PESSOA MAIS VELHA: " + nomePessoaMaisVelha);
    }
}
