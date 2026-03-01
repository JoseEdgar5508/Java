package secao17;

public class ProdutoEletronico {
    
    private String nome;
    private double preço;
    private int garantia; // em meses

    public ProdutoEletronico(String nome, double preço, int garantia){

        this.nome = nome;
        this.preço = preço;
        this.garantia = garantia;

    }

    public void aplicarDesconto(double porcentagem){

        if(porcentagem > 0 && porcentagem <= 100){

            double valorDesconto = calcularDesconto(porcentagem);

            preço -= valorDesconto;

            System.out.println("Desconto aplicado, preço agora é " + preço);

        } else{
            System.out.println("Porcentagem incorreta.");
        }

    }

    public double calcularDesconto(double porcentagem){
        return (preço * porcentagem) / 100;
    }

    public void exibirInfo(){
        System.out.println("O produto " + nome + ", está com o preço de " + preço +", e tem " + garantia + " meses de garantia.");
    }
}
