import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        Circulo circulo_uno;
        Triangulo triangulo_uno;
        Cuadrilatero cuadrado_uno;
        Pentagono pentagono_uno;
        Hexagono hexagono_uno;
        Heptagono heptagono_uno;

        System.out.println("Ingresa el radio del Circulo: ");
        circulo_uno=new Circulo(entrada.nextFloat());

        System.out.println("Ingrese los lados del Triángulo: ");
        triangulo_uno = new Triangulo(entrada.nextFloat(), entrada.nextFloat(), entrada.nextFloat());

        System.out.println("Ingrese los lados del Cuadrilatero: ");
        cuadrado_uno = new Cuadrilatero(entrada.nextFloat(), entrada.nextFloat(), entrada.nextFloat(),entrada.nextFloat());

        System.out.println("Ingrese los lados del Pentágono: ");
        pentagono_uno = new Pentagono(entrada.nextFloat(),entrada.nextFloat(),entrada.nextFloat(),entrada.nextFloat(),entrada.nextFloat());

        System.out.println("Ingrese los lados de un Hexágono: ");
        hexagono_uno = new Hexagono(entrada.nextFloat(),entrada.nextFloat(),entrada.nextFloat(),entrada.nextFloat(),entrada.nextFloat(),entrada.nextFloat());

        System.out.println("Ingrese los lados de un Heptágono: ");
        heptagono_uno=new Heptagono(entrada.nextFloat(),entrada.nextFloat(),entrada.nextFloat(),entrada.nextFloat(),entrada.nextFloat(),entrada.nextFloat(),entrada.nextFloat());


        System.out.println("\t\tFiguras en 2D");
        circulo_uno.mostrar_circulo();
        triangulo_uno.mostrar_triangulo();
        cuadrado_uno.mostrar_cuadrado();
        pentagono_uno.mostrar_pentagono();
        hexagono_uno.mostrar_hexagono();
        heptagono_uno.mostrar_heptagono();

    }
}