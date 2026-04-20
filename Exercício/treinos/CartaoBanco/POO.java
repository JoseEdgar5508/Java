package CartaoBanco;

public class POO {
    public static void main(String[] args) {
        CartaoBanco c1 = new CartaoBanco();
        CartaoBanco c2 = new CartaoBanco();

        c1.setNumCartao(1111);
        c1.setTitular("Edgar");
        c1.ativarCartao("Crédito");
        c1.comprar(40);
        c1.pagarFatura(40);

        c1.estadoAtual();

        c2.setNumCartao(2222);
        c2.setTitular("Luísa");
        c2.ativarCartao("Débito");
        c2.depositar(50);
        c2.comprar(40);

        c2.estadoAtual();

        
    }
}
