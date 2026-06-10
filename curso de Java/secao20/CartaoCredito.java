package secao20;

public class CartaoCredito implements Pagamento{

    @Override
    public void processarPagamento(double valor){
        System.out.println("Pagamento de $" + valor + ", via cartão de crédito.");
    }
    
}
