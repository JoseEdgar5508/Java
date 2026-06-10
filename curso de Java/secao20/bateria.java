package secao20;

public class bateria extends instrumentoMusical {
    
    public bateria(String nome) {
        super(nome);
    }

    @Override
    public void tocar() {
        System.out.println("Batendo nos tambores da " + nome);
    }

}
