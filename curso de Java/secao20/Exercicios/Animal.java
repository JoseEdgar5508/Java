package secao20.Exercicios;

public class Animal {

    protected String nome;
    protected String som;

    public Animal(String nome, String som){

        this.nome = nome;
        this.som = som;

    }

    public void emimtirSom(){
        System.out.println("O naimal " + nome + " está emitido um som " + som);
    }
    
}
