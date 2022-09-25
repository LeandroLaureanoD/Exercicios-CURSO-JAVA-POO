import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int qtdElementos = sc.nextInt();
        int cont = 0;
        double soma = 0;
        double[] vetorPares = new double[qtdElementos];

        for (int i = 0; i < vetorPares.length; i++){
            System.out.print("Digite um numero: ");
            vetorPares[i] = sc.nextDouble();
            if (vetorPares[i] % 2 == 0){
                soma += vetorPares[i];
                cont +=1;
            }
        }
        double avg = soma / cont;

        if (soma == 0){
            System.out.println("NENHUM NUMERO PAR ENCONTRADO");
        }else {
            System.out.println("MEDIA DOS PARES = " + avg);
        }
    }
}
