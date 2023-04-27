package problema1.paquete2;

public class Terreno {
    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    public Terreno(double ancho, double largo, double valorMetroCuadrado) {
        this.ancho = ancho;
        this.largo = largo;
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public double calcularArea() {
        area = ancho * largo;
        return area;
    }

    public double calcularCosto() {
        costo_terreno = area * valorMetroCuadrado;
        return costo_terreno;
    }
}
