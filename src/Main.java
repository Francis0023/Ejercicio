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
        int opcion;
        do {
            System.out.println("Elija una figura geométrica ");
            System.out.println("1. Circulo\n2. Triangulo\n3. Cuadrilatero\n4. Pentágono\n5. Hexágono\n6. Heptágono\n0. Salir");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingresa el radio del Circulo: ");
                    circulo_uno=new Circulo(entrada.nextFloat());
                    circulo_uno.mostrar_circulo();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Ingrese los lados del Triángulo: ");
                    triangulo_uno = new Triangulo(entrada.nextFloat(), entrada.nextFloat(), entrada.nextFloat());
                    triangulo_uno.mostrar_triangulo();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Ingrese los lados del Cuadrilatero: ");
                    cuadrado_uno = new Cuadrilatero(entrada.nextFloat(), entrada.nextFloat(), entrada.nextFloat(),entrada.nextFloat());
                    cuadrado_uno.mostrar_cuadrado();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Ingrese los lados del Pentágono: ");
                    pentagono_uno = new Pentagono(entrada.nextFloat(),entrada.nextFloat(),entrada.nextFloat(),entrada.nextFloat(),entrada.nextFloat());
                    pentagono_uno.mostrar_pentagono();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Ingrese los lados de un Hexágono: ");
                    hexagono_uno = new Hexagono(entrada.nextFloat(),entrada.nextFloat(),entrada.nextFloat(),entrada.nextFloat(),entrada.nextFloat(),entrada.nextFloat());
                    hexagono_uno.mostrar_hexagono();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Ingrese los lados de un Heptágono: ");
                    heptagono_uno=new Heptagono(entrada.nextFloat(),entrada.nextFloat(),entrada.nextFloat(),entrada.nextFloat(),entrada.nextFloat(),entrada.nextFloat(),entrada.nextFloat());
                    heptagono_uno.mostrar_heptagono();
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

        }while(opcion != 0);
    }
}