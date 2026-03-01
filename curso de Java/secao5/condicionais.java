package secao5;

public class condicionais {
    public static void main(String[] args) {
        //1 - o que é boolean

        boolean istrue = true;
        boolean isfalse = false;

        System.out.println(istrue);
        System.out.println(isfalse);

        System.out.println("---------------------------------------");

        // 2- operadores de comparaçõa

        int x = 10;

        System.out.println(x == 10);
        System.out.println(x == 9);
        System.out.println(x != 5);
        System.out.println(x != 10);
        System.out.println(x > 10);
        System.out.println(x >= 10);
        System.out.println(x < 10);
        System.out.println(x <= 10);

        System.out.println("-------------------------------------------");

        // 3- atribuição e comparação.

        int n = 5;
        int m = 10;

        System.out.println(n == 12);
        System.out.println(n);

        System.out.println(m == n);

        System.out.println("----------------------------------------");

        // 4- comparação de strings

        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1 == str2);
        System.out.println(str1 == "Java");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals("Java"));
        String str3 = "JAVA";
        System.out.println(str1.equals(str3));
        //Java == JAVA (false) > java == java
        System.out.println(str1.equalsIgnoreCase(str3));

        System.out.println("---------------------------------");

        // 5- if

        int numero = 10;


        // Baseado em uma cparação, eu executo algo
        if (numero > 5){

            System.out.println("O numero é maior que 5.");

        }

        // if com Strings

        String texto = "Teste";

        // Se a operação retorna um boolenao, eu posso usar um if

        if(texto.equals("Teste")){

            System.out.println("O texto é o teste");

        }

        // declaração do if (comparação ou retorno de booleano) {o que será executado... }

        // 6- else

        int q = 7;

        if(q > 10){
            System.out.println("Q é maior que 10.");
        }else{
            System.out.println("Ensira um número maior que 10!");

        }

        // Todo else precisa de um if mas, nem todo if precisa ter um else

        if(texto.equals("Teste2")){
            System.out.println("O texto é: Teste.");
        }else{
            System.out.println("O texto é diferente.");
        }

        System.out.println("-------------------------------------");

        // 7- else if

        double nota = 8.5;

        if (nota == 10){
            System.out.println("Você tirou a nota, máxima parabéns.");
        }
        else if (nota >= 9){
            System.out.println("Nota muito boa.");
        } else if (nota >= 7){
            System.out.println("Nota acima média.");
        }else{
            System.out.println("Abaixo da média.");
        }

        int num = 5;

        if (num > 3){
            System.out.println("Alguma coisa.");
        } else if (num == 5){
            System.out.println("Outra coisa.");
        }


    }
}
