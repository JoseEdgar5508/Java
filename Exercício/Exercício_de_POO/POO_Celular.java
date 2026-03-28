package Exercício_de_POO;

public class POO_Celular {
    public static void main(String[] args) {
        Celular celular1 = new Celular();

        celular1.setMarca("Motorola");
        celular1.setModelo("E6plus");
        celular1.setBateria(100);
        celular1.setLigado(true);
        celular1.exibirInfo();
        celular1.consumo();
    }
}
