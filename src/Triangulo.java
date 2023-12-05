public class Triangulo {
    public float lado_uno;
    public float lado_dos;
    public float lado_tres;

    public Triangulo(float lado_uno, float lado_dos, float lado_tres) {
        this.lado_uno = lado_uno;
        this.lado_dos = lado_dos;
        this.lado_tres = lado_tres;
    }

    public float getLado_uno() {
        return lado_uno;
    }

    public float getLado_dos() {
        return lado_dos;
    }

    public float getLado_tres() {
        return lado_tres;
    }

    public double perimetro_triangulo(){
        double perimetro=(this.getLado_uno()+this.getLado_dos()+this.getLado_tres());
        return perimetro;
    }

    public void mostrar_triangulo(){
        System.out.println("\nEl perimetro del triangulo es: "+perimetro_triangulo());
    }
}
