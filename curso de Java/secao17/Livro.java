package secao17;

public class Livro {
    private String titulo;
    private String autor;
    private double preço;

    // fallback

    public Livro(){
        this.titulo = "Título teste";
        this.autor = "Autor";
        this.preço = 16.99;
    }

    // override

    public Livro(String titulo, String autor, double preço){
        this.titulo = titulo;
        this.autor = autor;
        this.preço = preço;
    }

    public void exibirInfo(){
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", preço: " + preço);
    }

}
