package secao8;

public class FuncaoBlitin {
    public static void main(String[] args) {
        
        // funções Built in com strings
        String frase = "Java é muito bom!";

        //length
        System.out.println(frase.length());

        // int => inteiro
        // String => S => letra maiuscula inicial => classe

        System.out.println(frase.substring(0, 04));

        System.out.println(frase.toUpperCase());

        System.out.println(frase.replace("a", "e"));

        // funções de math

        System.out.println(Math.sqrt(26));
        System.out.println(Math.sqrt(9));

        System.out.println(Math.pow(2, 3));

        System.out.println(Math.abs(-10));

        System.out.println(Math.max(100, 10));
    }
}
