package vistas.fraccion;

public class Cliente {
    public static void main(String[] args) {
        
        Fraccion dosCuartos = new Fraccion(2,4);
        Fraccion tresQuintos = new Fraccion(3,5);
        Fraccion cinco = new Fraccion(5);

        Fraccion cuatrocientosDecimos = new Fraccion(400, 10);


        System.out.println("Antes de simplificar: " + cuatrocientosDecimos);
        cuatrocientosDecimos.simplificar();
        System.out.println("Después de simplificar: " + cuatrocientosDecimos);


        System.out.println("¿Es mayor 2/4 que 3/5? " + dosCuartos.esMayorQueFraccion(tresQuintos));
        System.out.println("¿Es mayor 5 que 3/5? " + cinco.esMayorQueFraccion(tresQuintos));

        System.out.println("¿Cuánto es 5 entre 2/4?");
        cinco.dividir(dosCuartos).simplificar();
        System.out.println(cinco);
    }
}