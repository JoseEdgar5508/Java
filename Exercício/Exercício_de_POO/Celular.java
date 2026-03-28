package Exercício_de_POO;

public class Celular {
    private String marca;
    private String modelo;
    private int bateria;
    private boolean ligado;

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }

    public void consumo(){
        if(ligado){
            System.out.println("A bateria está reduzindo " + (bateria - 1));
        }else{
            System.out.println("A bateria continua normal " + bateria);
        }
    }

    public void exibirInfo(){
        System.out.println("Veja as informações do celular:");
        System.out.println("A marca é " + marca);
        System.out.println("O modelo é " + modelo);
        System.out.println("A bateria é " + bateria);
        System.out.println("Está ligado " + ligado);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    

}
