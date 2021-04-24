package sample;

import sample.model.Livro;

public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.setAno(1990);
        livro.setAutor("Marcos Aurora");
        livro.setEditora("Editora Azul");
        livro.setTitulo("Pérolas do mar");

        System.out.println(livro);
    }
}
