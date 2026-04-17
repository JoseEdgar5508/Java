package Faculdade.aula4;

public class exemplo {
    public static void main(String[] args) {
        int a = 1; // declarada, mas NÃO inicializada
        String nome = null; // declarada, mas NÃO inicializada

        if (a > 0) { // só entra aqui SE a > 0
            a = 5;
            nome = "Maria";
        }

        System.out.println(a); // ❌ ERRO: e se o if não executou?
        System.out.println(nome); // ❌ ERRO: e se o if não executou?
    }
}
