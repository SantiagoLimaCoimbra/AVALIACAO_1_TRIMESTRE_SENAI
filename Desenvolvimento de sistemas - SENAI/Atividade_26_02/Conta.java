package sample.model;

//Class Conta
public class Conta {

    //Atributos
    String agencia;
    String contaCorrente;
    double saldo;

    //construtor
    public Conta(String agencia, String contaCorrente){
        this.agencia = agencia;
        this.contaCorrente = contaCorrente;
    }

    //metodos
    public double consultarSaldo(){
        return this.saldo;
    }

    public String consultarExtrato(){
        return "Extrato\n\n"
                + " Agencia: " + agencia
                + " Conta Corrente: " + contaCorrente
                + " Saldo: " + saldo;
    }

    public boolean depositar(double valor){
        if(valor >0 ){
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }
}
