package secao20;

public class violao extends instrumentoMusical{

    public violao(String nome){
        super(nome);
    }

    @Override
    public void tocar(){
        System.out.println("Tocando nas cordas " + nome);
    }
    
}
