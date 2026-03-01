package Banco;

public class POO {
    public static void main(String[] args) {
        Banco c1 = new Banco(0, false);

        // Configurando os dados da conta
        c1.setnumConta(12345);
        c1.setDono("João da Silva");
        c1.abrirConta("CC"); // Conta Corrente (abre com saldo inicial de 50)

        // Fazendo operações
        c1.depositar(100);  // Deposita R$100
        c1.sacar(30);       // Saca R$30
        c1.pagarMesal();    // Paga mensalidade (R$12 para CC)

        // Mostrando informações da conta
        System.out.println("Conta: " + c1.getnumConta());
        System.out.println("Dono: " + c1.getDono());
        System.out.println("Tipo: " + c1.getTipo());
        System.out.println("Saldo: R$" + c1.getSaldo());
        System.out.println("Status: " + (c1.getStatus() ? "Ativa" : "Inativa"));
    }
}
