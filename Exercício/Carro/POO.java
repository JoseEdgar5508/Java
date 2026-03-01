package Carro;

public class POO {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Gol";
        carro1.cor = "Vermelho";
        carro1.velocidade = 0;

        carro1.ligar();
        carro1.acelerar(30);
        carro1.status();
        carro1.frear(10);
        carro1.status();

        System.out.println("-------------------------");

        Carro carro2 = new Carro();
        carro2.modelo = "Civic";
        carro2.cor = "Preto";
        carro2.velocidade = 0;

        carro2.desligado();
        carro2.acelerar(20); // não deve funcionar pois está desligado
        carro2.ligar();
        carro2.acelerar(50);
        carro2.status();
    }
}
