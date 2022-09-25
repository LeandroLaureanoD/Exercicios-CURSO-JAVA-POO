import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int qtdElementos = sc.nextInt();

        double maiorAltura = 0;
        double menorAltura = 0;
        double soma = 0;
        double avg;
        int cont = 0;
        int qtdHomens;
        String[] genero = new String[qtdElementos];
        double[] altura = new double[qtdElementos];

        for (int i = 0; i < qtdElementos; i++) {

            System.out.print("Altura da " + (i + 1) + "º" + " pessoa: ");
            altura[i] = sc.nextDouble();

            sc.nextLine();
            System.out.print("Genero da " + (i + 1) + "º" + " pessoa: ");
            genero[i] = sc.nextLine();

            if (altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }else if (altura[i] < menorAltura || menorAltura == 0){
                menorAltura = altura[i];
            }
        }
        for (int i = 0; i < qtdElementos; i++){
            if (Objects.equals(genero[i], "f")) {
                soma += altura[i];
                cont += 1;
            }
        }
        avg = soma / cont;
        qtdHomens = qtdElementos - cont;
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Maior altura: " + maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n", avg);
        System.out.println("Numero de homens = " + qtdHomens);
    }
}
