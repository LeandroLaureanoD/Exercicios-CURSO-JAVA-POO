import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos elementos vai ter o vetor? ");
        int qtdElementos = sc.nextInt() ;
        double[] vetorA = new double[qtdElementos];
        double soma = 0;

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite um numero: ");
            vetorA[i] = sc.nextDouble();
            soma += vetorA[i];
        }
        System.out.println();
        double avg = soma / qtdElementos;
        System.out.print("MEDIA DO VETOR = " + avg + "\n");

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] < avg){
                System.out.println(vetorA[i]);
            }
        }

        sc.close();
    }
}
