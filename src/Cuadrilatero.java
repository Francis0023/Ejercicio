public class Cuadrilatero extends Triangulo{
    
    public float lado_cuatro;
    public Cuadrilatero(float lado_uno, float lado_dos, float lado_tres, float lado_cuatro) {
        super(lado_uno, lado_dos, lado_tres);
        this.lado_cuatro=lado_cuatro;
    }

    public float getLado_cuatro() {
        return lado_cuatro;
    }

    public double perimetro_cuadrilatero(){
        double perimetro=(this.getLado_uno()+this.getLado_dos()+this.getLado_tres()+this.getLado_cuatro());
        return perimetro;
    }

    public void mostrar_cuadrado(){
        System.out.println("\nEl perimetro del cuadrilatero es: "+perimetro_cuadrilatero());
    }
}
