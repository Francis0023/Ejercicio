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

        circulo_uno=new Circulo(6);
        triangulo_uno=new Triangulo(9,6,7);
        cuadrado_uno=new Cuadrilatero(9,7,10,12);
        pentagono_uno=new Pentagono(9,7,10,12,8);
        hexagono_uno=new Hexagono(5,7,2,10,7,8);
        heptagono_uno=new Heptagono(7,8,2,10,7,8,14);


        System.out.println("\t\tFiguras en 2D");
        circulo_uno.mostrar_circulo();
        triangulo_uno.mostrar_triangulo();
        cuadrado_uno.mostrar_cuadrado();
        pentagono_uno.mostrar_pentagono();
        hexagono_uno.mostrar_hexagono();
        heptagono_uno.mostrar_heptagono();

    }
}