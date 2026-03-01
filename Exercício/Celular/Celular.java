package Celular;

public class Celular {
    public String modelo;
    protected String dono;
    private int bateria;
    private boolean ligado;

    public void estadoAtual() {
        System.out.println("---------------------------------");
        System.out.println("Modelo do celular " + this.getModelo() + ".");
        System.out.println("Nome do dono " + this.getDono() + ".");
        System.out.println("Bateria " + this.getBateria() + ".");
        System.out.println("Está ligado? " + this.getLigado() + ".");
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("O celular foi ligado.");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("O celular foi desligado.");
    }

    public void usar(int tempo) {

        if (!this.ligado) {
            System.out.println("O celular está desligado. Ligue primeiro.");
            return;
        }

        int consumo = tempo * 5;

        if (this.bateria >= consumo) {
            this.bateria -= consumo;
            System.out.println("Celular usado por " + tempo + " unidades de tempo.");
            System.out.println("Bateria restante: " + this.bateria + "%.");
        } else {
            System.out.println("Bateria insuficiente para usar por esse tempo.");
            System.out.println("Bateria atual: " + this.bateria + "%.");
        }
    }

    public void carregar(int valor) {

        if (valor <= 0) {
            System.out.println("Valor inválido para carregamento.");
            return;
        }

        this.bateria += valor;

        if (this.bateria > 100) {
            this.bateria = 100;
        }

        System.out.println("Celular carregado.");
        System.out.println("Bateria atual: " + this.bateria + "%.");
    }

    public Celular() {
        this.bateria = 50;
        this.ligado = false;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

}
