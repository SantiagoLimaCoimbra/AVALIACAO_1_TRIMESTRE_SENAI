package sample.model;

public class Aluno extends Pessoa {

    //Atributos
    private double nota1;
    private double nota2;
    private double media;

    //Construtores
    public Aluno(){}

    //Sobrecarga
    public Aluno(String nome){
        super(nome);
    }


    //Get e Set
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;

        media = (nota1 + nota2) / 2;
    }


    //To String
    @Override
    public String toString() {
        return super.toString() + " [Aluno.]" +
                "\nNota1:" + nota1 +
                "; Nota2: " + nota2 +
                "; media: " + media;
    }
}
