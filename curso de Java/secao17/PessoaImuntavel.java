package secao17;

public class PessoaImuntavel {

    private final String nome;
    private final int idade;

    public PessoaImuntavel(String nome, int idade){

        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    //public void setNome(){
    //    this.nome = nome;
    //}
    
}
