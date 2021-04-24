package sample.model;

public class Conta {

    //atributos
    private double saldo;
    private double limite;
    private int numeroDaConta;
    private int numeroDaAgencia;

    //constante
    private static final int LIMITE = 200;

    //get e set
    public Conta(int numeroDaConta, int numeroDaAgencia){

        this.numeroDaAgencia = numeroDaAgencia;
        this.numeroDaConta = numeroDaConta;
        this.saldo = 0;
        this.limite = LIMITE;
    }

    public int getNumeroDaAgencia(){
        return this.numeroDaAgencia;
    }

    public void setNumeroDaAgencia(int numeroDaAgencia){
        this.numeroDaAgencia = numeroDaAgencia;
    }

    public int getNumeroDaConta(){
        return this.numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo(){
        return this.saldo;
    }

    //Metodos
    public void depositar(double valor){
        if(this.limite < LIMITE){
            if(valor <= this.limite){
                this.limite += valor;
            }else {
                this.limite = LIMITE;
                this.saldo = valor - LIMITE;
            }
        }else {
            this.saldo += valor;
        }
    }


    public boolean sacar(double valor){
        if((this.saldo + this.limite) >= valor){
            if(this.saldo == 0){
                this.limite -= valor;
            }else {
                this.saldo -= valor;
            }
            return true;
        } else {
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }


    //to string
    @Override
    public String toString() {
        return "Conta = " +
                "saldo: " + saldo +
                "; Limite: " + limite +
                "; Numero Da Conta: " + numeroDaConta +
                "; Numero Da Agencia: " + numeroDaAgencia;
    }

}
