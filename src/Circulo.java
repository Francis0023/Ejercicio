public class Circulo {

    public float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public double area_circulo(){
        double area=(Math.PI)*(Math.pow(this.getRadio(),2));
        return area;
    }
    public double perimetro(){
        double perimetro=(Math.PI)*(this.getRadio())*2;
        return perimetro;
    }

    public void mostrar_circulo(){
        System.out.println("\nEl area del circulo es: "+area_circulo());
        System.out.println("El perimetro del circulo es: "+perimetro());
    }
}
