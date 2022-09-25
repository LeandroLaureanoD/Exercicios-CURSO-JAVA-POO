import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] arargs){
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        int cont = 0;
        double altura;
        double sum = 0;
        double mediaAltura;
        int tamanho = 0;

        System.out.println("Quantas pessoas serão digitadas: ");

        Pessoa[] pessoaVetor = new Pessoa[tamanho];
        String[] armazenaNome = new String[tamanho];

        for (int i = 0; i < pessoaVetor.length; i++){
            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + "º" + " pessoa");
            System.out.print("Nome: ");
            nome = sc.nextLine();
            System.out.println();

            System.out.print("Idade: ");
            idade = sc.nextInt();
            System.out.println();

            System.out.print("Altura: ");
            altura = sc.nextDouble();

            pessoaVetor[i] = new Pessoa(nome, idade ,altura, pessoaVetor.length);

            if (idade < 16) {
                cont += 1;
                armazenaNome[i] = nome;
            }
            sum += pessoaVetor[i].getAltura();
        }
        System.out.println();
        mediaAltura = sum / tamanho;
        System.out.printf("Altura Média: %.2f%n",mediaAltura);

        int totalIdades = (cont * 100) / tamanho;
        System.out.println("Pessoas com menos de 16 anos: " + totalIdades + "%");
        //Arrays.stream(armazenaNome).forEach(System.out::println);//Imprimir elementos do Array
        for (int i = 0; i < cont; i++) {
            System.out.println(armazenaNome[i]);
        }
    sc.close();
    }

}
