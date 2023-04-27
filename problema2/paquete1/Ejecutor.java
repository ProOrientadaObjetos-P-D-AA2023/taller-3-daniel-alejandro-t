package problema2.paquete1;

import problema2.paquete2.EquivalenteHora;

public class Ejecutor {
    public static void main (String [] args){
        EquivalenteHora equivalenteHora = new EquivalenteHora(55);
        
        System.out.println(equivalenteHora.getCantidadTiempo());
    }
}
