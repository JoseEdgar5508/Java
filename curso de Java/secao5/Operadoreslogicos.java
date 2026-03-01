package secao5;

public class Operadoreslogicos {
    public static void main(String[] args) {
        
        // 8- AND

        int idade = 18;
        boolean temCarteiraDeMotorista = true;

        // treu == true > (variáveis)
        System.out.println(idade >= 18 && temCarteiraDeMotorista);
        System.out.println(idade >= 18 && temCarteiraDeMotorista == true);

        boolean carteiraVencida = false;

        System.out.println(idade == 18 && temCarteiraDeMotorista && carteiraVencida == false);

        int a = 10;
        int b = 20;

        if(a > 5 && b > 10){
            System.out.println("Deu certo!");
        }

        System.out.println("-----------------------------------------");

        // 9- Or 

        boolean estaChovendo = false;
        boolean temGuardaChuva = true;

        System.out.println(estaChovendo || temGuardaChuva);

        System.out.println(false || false);

        System.out.println(10 > 20 || 100 == 200);

        int idade2 = 16;
        boolean ehMenbro = false;

        // pode participar do clube
        // ele precisa ter > 16 anos ou ser menbro

        if(idade2 > 16 || ehMenbro){
            System.out.println("Pode entrar.");
        }else{
            System.out.println("Entrada negada.");
        }

        System.out.println("---------------------------------");

        // 10- NOT

        System.out.println(estaChovendo);
        System.out.println(!estaChovendo);

        System.out.println(estaChovendo || temGuardaChuva);

        System.out.println(estaChovendo || !temGuardaChuva);

    }
}
