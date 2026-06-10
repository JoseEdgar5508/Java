package secao20;

public class Violino extends instrumentoMusical{

    public Violino(String nome){
        super(nome);
    }

    @Override
    public void tocar(){
        System.out.println("Agora estmaos tocando o " + nome);
    }
    
}
