package Livro2;

public class Livro {
    private String nome;
    private String autor;
    private String genero;
    private int paginas;
    private boolean aberto;

    public Livro(String n, String a, String g, int p){
        this.setNome(n);
        this.setAutor(a);
        this.setGenero(g);
        this.setPaginas(p);
        this.abrir();
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String a){
        this.autor = a;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setGenero(String g){
        this.genero = g;
    }

    public int getPaginas(){
        return this.paginas;
    }

    public void setPaginas(int p){
        this.paginas = p;
    }

    public void abrir(){
        this.aberto = true;
    }

    public void fechar(){
        this.aberto = false;
    }

    public void status(){
        System.out.println("Sobre o livro:");
        System.out.println("Nome " + this.getNome());
        System.out.println("Autor " + this.getAutor());
        System.out.println("Genero " + this.getGenero());
        System.out.println("Páginas " + this.getPaginas());
        System.out.println("Está aberta? " + this.aberto);
    }
}
