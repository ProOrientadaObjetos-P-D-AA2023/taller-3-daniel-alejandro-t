package problema2.paquete2;

public class EquivalenteHora {
    int dias, horas, minutos, segundos;

    // Constructor lea una cantidad de horas e imprima su equivalente en minutos, segundos, días.
    public EquivalenteHora(int horas) {
        this.dias = horas / 24;
        this.horas = horas % 24;
        this.minutos = horas * 60;
        this.segundos = horas * 3600;
    }

    public String getCantidadTiempo(){
        return "Dias: " + this.dias + "\n" +
                "Horas: " + this.horas + "\n" +
                "Minutos: " + this.minutos + "\n" +
                "Segundos: " + this.segundos;
    }
}
