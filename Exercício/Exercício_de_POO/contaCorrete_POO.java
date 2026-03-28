package Exercício_de_POO;

public class contaCorrete_POO {
    public static void main(String[] args) {
        contaCorrente conta1 = new contaCorrente("Edgar", 1000, 200);

        System.out.println(conta1.getTitular());
        System.out.println(conta1.getSaldo());
        System.out.println(conta1.getLimiteSaque());

        conta1.depositar(100);
        conta1.sacar(50);
        conta1.exibirSaldo();
    }
}
