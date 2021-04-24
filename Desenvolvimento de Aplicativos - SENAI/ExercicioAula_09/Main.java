package sample;
import sample.model.Conta;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Conta conta1 = new Conta(777,"Jubileu", 500);
        conta1.setSaldo(conta1.getValorInicial());
        System.out.println("\nDados da conta: " + conta1.toString());

        conta1.depositar(400);
        System.out.println("\nDepositou: " + conta1.getDeposito());
        System.out.println("Dados da conta: " + conta1.toString());

        conta1.sacar(200);
        System.out.println("\nSacou: " + conta1.getSaque());
        System.out.println("Dados da conta: " + conta1.toString());



        Conta conta2 = new Conta(666, "Santiago");
        conta2.setSaldo(conta2.getSaldo());
        System.out.println("\nDados da conta: " + conta2.toString());

        conta2.depositar(400);
        System.out.println("\nDepositou: " + conta2.getDeposito());
        System.out.println("Dados da conta: " + conta2.toString());

        conta2.sacar(200);
        System.out.println("\nSacou: " + conta2.getSaque());
        System.out.println("Dados da conta: " + conta2.toString());
    }
}
