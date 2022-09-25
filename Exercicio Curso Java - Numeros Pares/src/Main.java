import java.util.Scanner;

public class Main {

    public static void main(String[] argrs){

        Scanner sc = new Scanner(System.in);
        int cont = 0;

        System.out.println("Quantos numeros você vai digitar: ");
        int tamanho = sc.nextInt();

        int[] numerosPares = new int[tamanho];

        for (int i = 0; i < numerosPares.length; i++){
            System.out.println("Digite um numero: ");
            numerosPares[i] = sc.nextInt();
        }
        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < tamanho; i++){
            if (numerosPares[i] % 2 == 0){
                System.out.print(numerosPares[i] + " ");
                cont += 1;
            }

        }
        System.out.println("\n");
        System.out.print("QUANTIDADE DE PARES = " + cont);
    }
}
