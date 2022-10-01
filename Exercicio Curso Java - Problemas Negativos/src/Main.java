import java.util.Scanner;

public class Main {

    public static void main(String[] arsgrs){
        Scanner sc = new Scanner(System.in);

        System.out.println("qual o tamanho do vetor ? ");
        int qtdNumeros = sc.nextInt() ;
        int[] vetor = new int[qtdNumeros];

        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();

        }
        System.out.println("Números negativos");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }else {
                sc.close();
            }
        }
        sc.close();
    }
}
