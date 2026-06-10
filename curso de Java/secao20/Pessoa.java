package secao20;

public class Pessoa {
    
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // Override - subescrita
    // Não é uma boa pratica fazer a subescrita de metódos do Java
    @Override
    public String toString(){
        return "Nome: " + nome + ", idade " + idade;
    }
}
