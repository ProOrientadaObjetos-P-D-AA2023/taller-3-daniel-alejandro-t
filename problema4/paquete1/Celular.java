package problema4.paquete1;

public class Celular {
    String sistemaOperativo, direccionMac, imei;
    double tamanoPantalla, costoInicial, porcentajeIva, costoFinal;

    // Constructor
    public Celular(String sistemaOperativo, String direccionMac, String imei, double tamanoPantalla, double costoInicial, double porcentajeIva) {
        this.sistemaOperativo = sistemaOperativo;
        this.direccionMac = direccionMac;
        this.imei = imei;
        this.tamanoPantalla = tamanoPantalla;
        this.costoInicial = costoInicial;
        this.porcentajeIva = porcentajeIva;
    }

    // Getters
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public String getDireccionMac() {
        return direccionMac;
    }

    public String getImei() {
        return imei;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public double getCostoInicial() {
        return costoInicial;
    }

    public double getPorcentajeIva() {
        return porcentajeIva;
    }

    // Setters

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public void setDireccionMac(String direccionMac) {
        this.direccionMac = direccionMac;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public void setCostoInicial(double costoInicial) {
        this.costoInicial = costoInicial;
    }

    public void setPorcentajeIva(double porcentajeIva) {
        this.porcentajeIva = porcentajeIva;
    }

    // Costo final será igual al costo inicial más el IVA
    public double getCostoFinal() {
        return costoInicial + (costoInicial * porcentajeIva);
    }
}