package sample.model;

public class Conta {

    //atributos
    private int numeroConta;
    private String nomeTitular;
    private double valorInicial;
    private double saldo;

    private double deposito;
    private double saque;

    //construtores
    public Conta(int numeroConta, String nomeTitular){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public Conta(int numeroConta, String nomeTitular, double valorInicial){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.valorInicial = valorInicial;
    }

    public void depositar(double deposito){
        this.deposito = deposito;
        saldo = deposito + saldo;
    }

    public void sacar(double saque){
        this.saque = saque;
        saldo = (saldo - saque) - 5;
    }

    //GETTER AND SETTER
    public int getNumeroConta() {
        return numeroConta;
    }


    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double valorInicial) {
        this.valorInicial = valorInicial;
        saldo = valorInicial;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    //to string
    @Override
    public String toString() {
        return "Numero da Conta: " + numeroConta +
                "; Nome do Titular: " + nomeTitular +
                "\nSaldo: " + saldo;
    }
}
