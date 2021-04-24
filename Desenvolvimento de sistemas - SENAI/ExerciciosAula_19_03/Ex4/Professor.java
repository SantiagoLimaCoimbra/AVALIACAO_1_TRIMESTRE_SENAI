package sample.model;

public class Professor extends Pessoa {
    //Atributos
    private double horasTrabalhadas;
    private double valorHora;
    private double salario;

    //Construtores
    public Professor(){}

    //Sobrecarga
    public Professor(String nome){
        super(nome);
    }


    //Get e Set
    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double horasTrabalhadas, double valorHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;

        salario = (horasTrabalhadas * valorHora);
    }


    //To String
    @Override
    public String toString() {
        return super.toString() + " [Professor.]" + "\nHoras Trabalhadas: " + horasTrabalhadas +
                "; Valor Hora: " + valorHora +
                "; Salario:" + salario;
    }
}
