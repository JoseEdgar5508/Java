package Exercício.Exercicios_claude;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar(){
        System.out.println("Olá, meu nome é " + getNome() + " e tenho " + getIdade() + " anos.");
    }

    public void ehMaiorDeIdade(){
        if(getIdade() >= 18){
            System.out.println("Ele é de maior.");
        } else{
            System.out.println("Ele não é maior de idade.");
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Edgar", 20);

        p1.apresentar();
        p1.ehMaiorDeIdade();
    }

}
