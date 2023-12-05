public class Pentagono extends Cuadrilatero{
    public float lado_cinco;

    public Pentagono(float lado_uno, float lado_dos, float lado_tres, float lado_cuatro, float lado_cinco) {
        super(lado_uno, lado_dos, lado_tres, lado_cuatro);
        this.lado_cinco = lado_cinco;
    }

    public float getLado_cinco() {
        return lado_cinco;
    }

    public double perimetro_pentagono(){
        double perimetro= (getLado_uno()+getLado_dos()+getLado_tres()+getLado_cuatro()+getLado_cinco());
        return perimetro;
    }

    public void mostrar_pentagono(){
        System.out.println("El perimetro del pentagono es: "+perimetro_pentagono());
    }
}
