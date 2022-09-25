import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o tamanho do vetor ? ");
        int qtdNumeros = sc.nextInt() ;
        int[] vetorA = new int[qtdNumeros];
        int[] vetorB = new int[qtdNumeros];
        int[] vetorResult = new int[qtdNumeros];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B: ");
        for (int j = 0; j < vetorB.length; j++) {
            vetorB[j] = sc.nextInt();
        }
        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < vetorResult.length; i++) {
            vetorResult[i] = vetorA[i] + vetorB[i];
            System.out.println((vetorResult[i]));
        }
        sc.close();
    }
}
