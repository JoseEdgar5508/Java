package Verificador_de_aprovacao;

public class aprovado {
    public static void main(String[] args) {

        double retposta = verificarAprovacao(10, 02, 03);

        System.out.println(retposta);
        
    }

    public static double verificarAprovacao(double nota1, double nota2, double nota3){
        double media = (nota1 + nota2 + nota3) / 3;

        if( media <= 10 && media >= 7){
            System.out.println("Aluno aprovado.");
        } else if( 6.9 >= media && media >= 5 ){
            System.out.println("Aluno em recuperação.");
        } else{
            System.out.println("Aluno reprovado.");
        }

        return media;

        }
    }

