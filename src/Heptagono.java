public class Heptagono extends Hexagono{
    public float lado_siete;

    public Heptagono(float lado_uno, float lado_dos, float lado_tres, float lado_cuatro, float lado_cinco, float lado_seis, float lado_siete) {
        super(lado_uno, lado_dos, lado_tres, lado_cuatro, lado_cinco, lado_seis);
        this.lado_siete = lado_siete;
    }

    public float getLado_siete() {
        return lado_siete;
    }

    public double perimetro_heptagono(){
        double perimetro=(getLado_uno()+getLado_dos()+getLado_tres()+getLado_cuatro()+getLado_cinco()+getLado_seis()+getLado_siete());
        return perimetro;
    }

    public void mostrar_heptagono(){
        System.out.println("El perimetro del heptago es: "+perimetro_heptagono());
    }
}
