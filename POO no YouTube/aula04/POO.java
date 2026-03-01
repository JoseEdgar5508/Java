package aula04;

public class POO {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", 0.4f, "Amarelo");

        //c1.setModelo("Bic");
        //c1.modelo = "Bic"; pode ser feito desse jeito já que o acesso é publico.
        //c1.setPonta(0.5f);
        //c1.ponta = 0.5f; não pose ser acessado pois o acesso é privado

         // c1.status(); ou
         //System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());

         c1.status();

    }
}
