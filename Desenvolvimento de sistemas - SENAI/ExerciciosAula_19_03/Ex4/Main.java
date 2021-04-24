package sample;

import sample.model.Aluno;
import sample.model.Professor;

public class Main {

    public static void main(String[] args) {

        /*Aluno aluno = new Aluno("Santi");
        aluno.setNota1(6);
        aluno.setNota2(8);
        aluno.setMedia(0);
        System.out.println(aluno);

        Professor professor = new Professor("Jubileu");
        professor.setHorasTrabalhadas(12);
        professor.setValorHora(12);
        //professor.setSalario(salario);
        System.out.println(professor);*/

        Professor professor1 = new Professor("Santiago");
        professor1.setSalario(160, 11);
        System.out.println(professor1 + "\n");

        Aluno aluno1 = new Aluno("Jubileu");
        aluno1.setMedia(5, 8);
        System.out.println(aluno1 + "\n");

    }
}
