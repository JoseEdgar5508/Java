package Exercício.Exercicios_claude;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    public void sacar(double valor) {
        if (getSaldo() >= valor) {
            this.setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Saque invalido.");
        }
    }

    public void exibirSaldo() {
        System.out.println("O saldo é " + getSaldo());
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

    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Edgar");

        c1.depositar(100);
        c1.sacar(150);
        System.out.println("Titular: " + c1.getTitular());
        c1.exibirSaldo();
    }
}
