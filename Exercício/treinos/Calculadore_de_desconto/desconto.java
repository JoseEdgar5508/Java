package Calculadore_de_desconto;

public class desconto {
    public static void main(String[] args) {
        
        double preco = calcularDesconto(100, 20);
        System.out.println(preco);

    }

    public static double calcularDesconto(double preco_original, double porcentagem_desconto){
        return (((porcentagem_desconto * preco_original) / 100) - preco_original) * -1;
    }
}
