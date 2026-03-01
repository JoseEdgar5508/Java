package secao17;

public class Produtos {
    
    private String nome;
    private double preço;

    // REGRA DE NEGÓCIOS = CÓDIGO
    // é como a empresa define como o software vai funcionar

    public void setNome(String nome){

        if(nome != null && !nome.isEmpty() && nome.length() > 3){
            this.nome = nome;
        } else{
            System.out.println("O nome enviado não atende as critérios.");
        }

    }

    public String getNome(){
        return nome.toUpperCase();
    }

    public void setPreço(double preço){

        if(preço >= 0){
            this.preço = preço;
        } else {
            System.out.println("O preço enviado não atende aos critérios.");
        }
        
    }

    public String getPreço(){
        return String.format("R$%.2f", preço);
    }

    public String getProdutoInfo(){
        return "Nome " + this.getNome() + ", Preço " + this.getPreço();
    }

    public void aplicarDesconto(double porcentagem){

        if(porcentagem > 0 && porcentagem <= 100){

            double desconto = calcularDesconto(porcentagem);

            this.preço -= desconto;

            System.out.println("Desconto de " + porcentagem + "% aplicado!");

            System.out.println(this.getProdutoInfo());

        } else{
            System.out.println("Porcentagem inválida.");
        }

    }

    private double calcularDesconto(double porcentagem){
        return (this.preço * porcentagem) / 100;
    }
}
