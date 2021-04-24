package sample;

import sample.model.Cliente;
import sample.model.Funcionario;

public class Main {

    public static void main(String[] args){

        Funcionario pessoa1 = new Funcionario("Santiago", "Lima Coimbra", "Santi@gmail.com", "999999999");
        pessoa1.setFuncao("Adiministrador");
        pessoa1.setSalario(25, 160);
        System.out.println(pessoa1 + "\n");

        Cliente pessoa2 = new Cliente("Jubileu", "Da rosa", "Jubileu@gmail.com", "888888888");
        pessoa2.setDataCadastro("02/02/2002");
        System.out.println(pessoa2+ "\n");

    }
}
