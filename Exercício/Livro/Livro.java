package Livro;

public class Livro {
    public String título;
    private String autor;
    private int páginas;
    private boolean aberto;

    public Livro(String t, String a, int p){
        this.setTitulo(t);
        this.setAutor(a);
        this.setPaginas(p);
        this.fechar();
    }

    public String getTitulo(){
        return this.título;
    }

    public void setTitulo(String t){
        this.título = t;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String a){
        this.autor = a;
    }

    public int getPaginas(){
        return this.páginas;
    }

    public void setPaginas(int p){
        this.páginas = p;
    }
    
    public void abrir(){
        this.aberto = true;
    }

    public void fechar(){
        this.aberto = false;
    }

    public void status(){
        System.out.println("Sobre o Livro.");
        System.out.println("Título é " + this.getTitulo());
        System.out.println("Autor é " + this.getAutor());
        System.out.println("Tem a quantidade de " + this.getPaginas() + " páginas.");
        System.out.println("Está aberto? " + this.aberto);
    }

}
