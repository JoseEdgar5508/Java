package secao5;

public class Switcase {
    public static void main(String[] args) {
        
        // 11- switch case e break

        // validar dia da semana baseado no número
        // 1- Domingo
        // 7- Sabado

        int diaDaSemana = 1;

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo.");
                break;
            case 2:
                System.out.println("Segunda.");
                break;
            case 3:
                System.out.println("Terça.");
                break;
        }
        System.out.println("-------------------------------------");

        // 12- default

        int n = 10;

        switch (n) {
            case 1:
                System.out.println("É 1.");
                break;
            
            case 2:
                System.out.println("É 2.");
                break;
        
            default:
                System.out.println("Número não encontrado.");
                break;
        }
        System.out.println("-------------------------------");

        //13- switch sem break

        switch (1) {
            case 1:
                System.out.println("Executou 1");
                
            case 2: 
                System.out.println("Executou 2");
                
            case 3:
                System.out.println("Executou 3");
            default:
                System.out.println("Executou 4");
        }

    }
}
