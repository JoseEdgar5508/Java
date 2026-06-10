package secao20;

abstract class instrumentoMusical {

    protected String nome;

    public instrumentoMusical(String nome){
        this.nome = nome;
    }

    // abestrat: tem que ser implementado na subclasse
    public abstract void tocar();

    // concreto: pode ser herdado
    public void exibirDetalhes(){
        System.out.println("Instrumento " + nome);
    }
    
}
