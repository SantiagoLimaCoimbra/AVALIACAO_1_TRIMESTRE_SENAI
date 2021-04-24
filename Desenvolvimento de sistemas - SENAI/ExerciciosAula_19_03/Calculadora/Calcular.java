package sample.model;

public class Calcular {
    //Atributos
    private double a;
    private double b;
    private double c;
    private double resultado;

    //Construtores
    public void somar(double a, double b){
        this.a = a;
        this.b = b;
        resultado = a + b;
    }

    public void somar(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        resultado = a + b + c;
    }

    public void subitrair(double a, double b){
        this.a = a;
        this.b = b;
        resultado = a - b;
    }

    public void subitrair(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        resultado = a - b - c;
    }

    public void mutiplicar(double a, double b){
        this.a = a;
        this.b = b;
        resultado = a * b;
    }

    public void mutiplicar(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        resultado = a * b * c;
    }

    public void dividir(double a, double b){
        this.a = a;
        this.b = b;
        resultado = a / b;
    }

    public void dividir(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        resultado = a / b / c;
    }


    //To String
    @Override
    public String toString() {
        return "A= " + a +
                "; B= " + b +
                "; C= " + c +
                "\nResultado == " + resultado;
    }
}
