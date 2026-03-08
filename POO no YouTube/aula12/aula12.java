package aula12;

public class aula12 {
    public static void main(String[] args) {
        //Animal n = new Animal();
        Mamivero m = new Mamivero();
        Repitil r = new Repitil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();

        m.setCorPelo("Marrom");
        r.setIdade(100);
        a.setCorPena("Azul");
        p.setCorEscama("Vermelha");

        c.usandoBolsa();
        k.emitirSom();
        j.emitirSom();
        t.locomover();
        g.locomover();
        e.locomover();


    }
}
