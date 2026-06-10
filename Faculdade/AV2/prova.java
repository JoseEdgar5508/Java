package Faculdade.AV2;

import java.util.ArrayList;

public class prova {
    public static void main(String[] args) {
        try {
            ArrayList<Pessoa> pessoas = new ArrayList<>();

            pessoas.add(new Pessoa("Ana", 22));
            pessoas.add(new Pessoa("Bruno", 30));
            pessoas.add(new Pessoa("Carla", 25));
            pessoas.add(new Pessoa("Daniel", 28));
            pessoas.add(new Pessoa("Elisa", 19));
            pessoas.add(new Pessoa("Felipe", 35));
            pessoas.add(new Pessoa("Gabriela", 27));
            pessoas.add(new Pessoa("Henrique", 21));
            pessoas.add(new Pessoa("Isabela", 24));
            pessoas.add(new Pessoa("João", 31));

            for (Pessoa p : pessoas) {
                System.out.println(p);
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}