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

    public Fraccion clonar(){
        return new Fraccion(this);
    }

    public void sumar(Fraccion fraccion){
        assert fraccion != null : "La fracción no puede ser nula";

        int nuevoNumerador = (this.numerador * fraccion.denominador)+(this.denominador * fraccion.numerador);
        int nuevoDenominador = this.denominador * fraccion.denominador;

        this.numerador = nuevoNumerador;
        this.denominador = nuevoDenominador;
    }
    public void restar(Fraccion fraccion){
        assert fraccion != null : "La fracción no puede ser nula";

        fraccion.numerador *= -1;

        this.sumar(fraccion);

        fraccion.numerador *= 1;
    }
    public void multiplicar(Fraccion fraccion){}
    public void dividir(Fraccion fraccion){}

    public boolean esMayor(){}
    public boolean esMenor(){}

    public boolean equals(Fraccion fraccion){}

    public String toString(){}
    public void invertir(){}
    public void oponer(){}

}