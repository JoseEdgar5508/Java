package Exercício_de_POO;

public class contaCorrente {
    private String titular;
    private double saldo;
    private double limiteSaque;

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Deposito realizado com sucesso!");
        } else{
            System.out.println("Valor invalido.");
        }
    }

    public void sacar(double valor){
        if(valor <= limiteSaque && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque feito com sucesso.");
        } else{
            System.out.println("Saque não permitido.");
        }
    }

    public void exibirSaldo(){
        System.out.println("O saldo é: " + saldo);
    }

    public contaCorrente(String titular, double saldo, double limiteSaque){
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    } 
}
