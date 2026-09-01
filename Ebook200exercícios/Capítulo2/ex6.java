package Ebook200exercícios.Capítulo1;

/*Crie um programa que utilize a palavra-chave final para declarar uma constante que
representa a velocidade da luz no vácuo. Tente alterar o valor da constante e observe o
comportamento do compilador. */

public class ex6 {
    public static void main(String[] args) {
        final double valoicadeDaLuz = 299792458;

        System.out.println("Avelociade da luz é " + valoicadeDaLuz + "m/s");

        //valoicadeDaLuz = 3445532243;
    }
}
