package secao8;

public class FuncaoB {

    // escopo global
    static int globalvar = 20;
    public static void main(String[] args) {
        
        // 5- funções com condicionais
        String r1 = verificarAcesso(19, false, false);

        System.out.println(r1);

        String r2 = verificarAcesso(19, false, true);

        System.out.println(r2);

        // 6- Funções com switch
        
        System.out.println(obterDiaDaSemana(5));

        System.out.println(obterDiaDaSemana(10));

        // 7- system exit
        verificarAntenticacao( "admim", "SenhaSegura");

        System.out.println("oi");

        // 8- documentação de função

        System.out.println(calcularMedia(5, 6, 7));

        // 9- escopos

        // escopo local
        int valoLocal = 10;

        if(true){
            System.out.println(valoLocal);
        }

        System.out.println(globalvar);

        int testeFnEscopo = espacolocal(valoLocal);

        System.out.println(testeFnEscopo);

        
    }

    public static String verificarAcesso(int idade, boolean temCarteira, boolean temHistoricoNegativo){

        if (idade >= 18 && temCarteira && !temHistoricoNegativo) {
            return "Acesso permitido: todos os critérios atendidos!";
        } else if(idade >= 18 && temCarteira && temHistoricoNegativo){
            return "Acesso negado: histórico negativo detectado.";

        }else{
            return"Acesso negado: critérios não atendidos!";
        }

    }

    public static String obterDiaDaSemana(int dia){
        switch (dia){
            case 1:
               return "Segunda-feria";
            case 2:
               return "Terça-feria";
            case 3:
               return "Quarta-feria";
            case 4:
               return "Quinta-feria";
            case 5:
               return "Sexta-feria";
            case 6:
               return "Sábado-feria";
            case 7:
               return "Domingo-feria";   
            default:
               return "Dia da semana inválido";
        }
    }

    public static void verificarAntenticacao(String usuario, String senha){

        if(!usuario.equals("admim") || !senha.equals("SenhaSegura")){
            System.out.println("Antenticção falhou");
            System.exit(1);
        }

        System.out.println("Autanticação bem sucedida!");
    }   
    /**
     * 
     * clacula  a média de três números inteiros
     * 
     * @param num1 o primeiro número a ser enviado
     * @param num2 o segundo número a ser enviado
     * @param num3 o terceiro número a ser enviado
     * @return A media dos três números
    */
    public static double calcularMedia(int num1, int num2, int num3){
        return (num1 + num2 + num3) / 3;
    }

    public static int espacolocal(int a){
        System.out.println(globalvar);
        System.out.println(a);

        int testeFuncao = 1;

        return testeFuncao;
    }
}
