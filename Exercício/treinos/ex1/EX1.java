package ex1;

public class EX1 {
    public static void main(String[] args) {

        //EX1
        int valor = 10;
        int valorDobrado = valor * 2;
        System.out.println(valorDobrado);

        //EX2
        char valorChar = 'B';
        int valorInt = (int) valorChar;
        System.out.println(valorInt);

        //EX3
        double valorDouble1 = 15.75;
        double valorDouble2 = 20.40;

        double somaDouble = valorDouble1 + valorDouble2;

        System.out.println(somaDouble);

        //EX4
        long valorLong = 2_000_000_000L;

        int valorInt2;

        valorInt2 = (int) valorLong;

        System.out.println(valorInt2);

        //EX5
        String olaMundo = "Olá mundo, ";

        String bemVindoAoJava = olaMundo + "bem vindo ao Java!";

        System.out.println(bemVindoAoJava);
    }
}
