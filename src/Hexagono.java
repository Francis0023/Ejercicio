public class Hexagono extends Pentagono{
    public float lado_seis;

    public Hexagono(float lado_uno, float lado_dos, float lado_tres, float lado_cuatro, float lado_cinco, float lado_seis) {
        super(lado_uno, lado_dos, lado_tres, lado_cuatro, lado_cinco);
        this.lado_seis = lado_seis;
    }

    public float getLado_seis() {
        return lado_seis;
    }

    public double perimetro_hexagono(){
        double perimetro=(getLado_uno()+getLado_dos()+getLado_tres()+getLado_cuatro()+getLado_cinco()+getLado_seis());
        return perimetro;
    }

    public void mostrar_hexagono(){
        System.out.println("\nEl perimetro del hexagono es: "+perimetro_hexagono());
    }
}
