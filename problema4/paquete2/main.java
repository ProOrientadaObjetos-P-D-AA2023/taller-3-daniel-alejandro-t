package problema4.paquete2;

import problema4.paquete1.Celular;

public class main {
    public static void main(String [] args){
        Celular celular = new Celular("Android", "00:00:00:00:00:00", "000000000000000", 5.5, 1000, 0.16);
        System.out.println("Sistema operativo: " + celular.getSistemaOperativo());
        System.out.println("Dirección MAC: " + celular.getDireccionMac());
        System.out.println("IMEI: " + celular.getImei());
        System.out.println("Tamaño de pantalla: " + celular.getTamanoPantalla());
        System.out.println("Costo inicial: " + celular.getCostoInicial());
        System.out.println("Porcentaje de IVA: " + celular.getPorcentajeIva());
        System.out.println("Costo final: " + celular.getCostoFinal());
    }
}