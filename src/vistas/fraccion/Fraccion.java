package vistas.fraccion;

public class Fraccion {
    private int numerador;
    private int denominador;





    public Fraccion(int numerador, int denominador){
        assert denominador != 0 : "Error. No puedes declarar el denominador como 0";
        this.numerador = numerador;
        this.denominador = denominador;
    }



    public Fraccion(int numero){
        this.numerador = numero;
        this.denominador = 1;
    }



    public Fraccion(Fraccion fraccion){
        this.numerador = fraccion.numerador;
        this.denominador = fraccion.denominador;
    }

    public Fraccion clonar(){}

    public void sumar(Fraccion fraccion){}
    public void restar(Fraccion fraccion){}
    public void multiplicar(Fraccion fraccion){}
    public void dividir(Fraccion fraccion){}

    public boolean esMayor(){}
    public boolean esMenor(){}

    public boolean equals(Fraccion fraccion){}

    public String toString(){}
    public void invertir(){}
    public void oponer(){}

}