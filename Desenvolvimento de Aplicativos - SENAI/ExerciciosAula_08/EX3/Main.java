package sample;

import sample.model.Funcionario;

public class Main {

    public static void main(String[] args){

        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Santiago";
        funcionario1.salario = 4300.00;
        System.out.println(funcionario1);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "Jubileu";
        funcionario2.salario = 3700.50;
        System.out.println(funcionario2);

        double salarioMedio = (funcionario1.salario + funcionario2.salario) / 2;

        System.out.println("\nSalário médio: " + salarioMedio);
    }
}
