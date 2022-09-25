import java.util.Scanner;

public class Main {

    public static void main(String[] argrs){

        Scanner sc = new Scanner(System.in);
        int posicao = 0;
        int numeroMaior = 0;

        System.out.print("Quantos numeros você vai digitar: ");
        int tamanho = sc.nextInt();
        System.out.println("__________________________________");

        int[] numerosPares = new int[tamanho];

        for (int i = 0; i < numerosPares.length; i++){
            System.out.println("Digite um numero: ");
            numerosPares[i] = sc.nextInt();
        }
        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < tamanho; i++){
            if (numerosPares[i] > numeroMaior){
                numeroMaior = numerosPares[i];
                posicao = i;
            }
        }
        System.out.println("\n");
        System.out.println("MAIOR VALOR = " + numeroMaior);
        System.out.print("POSICAO DO MAIOR VALOR = " + posicao);
    }
}
