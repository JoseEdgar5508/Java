package CartaoBanco;

public class CartaoBanco {
    public int numCartao;
    protected String tipo;
    private String titular;
    private float limite;
    private float saldo;
    private boolean ativo;

    public CartaoBanco(){
        this.ativo = false;
        this.saldo = 0;
    }

    public void estadoAtual(){
        System.out.println("--------------------------------");
        System.out.println("Numero do cartão: " + this.numCartao + ".");
        System.out.println("Tipo do cartão: " + this.tipo + ".");
        System.out.println("Titular do cartão: " + this.titular);
        System.out.println("Limite do cartão: " + this.limite + ".");
        System.out.println("Saldo do cartão: " + this.saldo + ".");
        System.out.println("O cartão está ativo? " + this.ativo + ".");
        System.out.println("--------------------------------");
    }

    public void ativarCartao(String t){
        this.setTipo(t);
        this.setAtivo(true);
        if (t.equals("Crédito")){
            this.setLimite(1000);
        } else if (t.equals("Débito")){
            this.setSaldo(100);
        }
        System.out.println("Cartão ativado com sucesso!");
    }

    public void bloquearCartao(){
        if(this.getAtivo()){
            this.setAtivo(false);
            System.out.println("Cartão bloqueado.");
        } else{
            System.out.println("Cartão já está bloquado.");
        }
    }

    public void comprar(float valor){
        if(this.getAtivo()){
            if(this.getTipo().equals("Crédito")){
                if(this.getLimite() >= valor){
                    this.setLimite(this.getLimite() - valor);
                    System.out.println("Compra de R$" + valor + " realizada no crédito.");
                } else{
                    System.out.println("Limite insuficiente!");
                }
            } else if(this.getTipo().equals("Débito")){
                if(this.getSaldo() >= valor){
                    this.setSaldo(this.getSaldo() - valor);
                    System.out.println("Compra de R$" + valor + " realizada no débito.");
                } else{
                    System.out.println("Saldo insuficiente!");
                }
            } else{
                System.out.println("Cartão bloqueado, não é possível comprar.");
            }
        }
    }

    public void pagarFatura(float valor){
        if(this.getTipo().equals("Crédito")){
            this.setLimite(this.getLimite() + valor);
            System.out.println("Fatura paga com secesso!");
        } else{
            System.out.println("Este cartão não é de Crédito.");
        }
    }

    public void depositar(float valor){
        if(this.getTipo().equals("Débito")){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito de R$" + valor + " realizado!");
        } else{
            System.out.println("Não é possível depositar em um cartão de crédito.");
        }
    }

    public int getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(int numCartao) {
        this.numCartao = numCartao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
