public class Pessoa {


    private String nome;
    private int idade;
    private double altura;

    private int tamanhoVetor;
    private double soma;

    public Pessoa(String nome, int idade, double altura, int tamanhoVetor) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.tamanhoVetor = tamanhoVetor;
    }

    public double getAltura() {
        return altura;
    }
}
