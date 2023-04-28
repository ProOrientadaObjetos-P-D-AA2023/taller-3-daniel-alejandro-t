package problema3.paquete2;

import problema3.paquete1.Institucion;

public class main {
    public static void main (String [] args){
        Institucion institucion = new Institucion("Universidad Técnica Particular de Loja", "Privada", 10000, 100000, 10000, 1000, 1);
        
        System.out.println("Nombre: " + institucion.getNombre());
        System.out.println("Tipo: " + institucion.getTipoInstitucion());
        System.out.println("Gasto por estudiantes: " + institucion.getGastoProyectadoPorEstudiante());
        System.out.println("Presupeuesto: " + institucion.getPresupuesto());
        System.out.println("Número de estudiantes: " + institucion.getNumeroEstudiantes());
        System.out.println("Docentes: " + institucion.getNumeroDocentes());
        System.out.println("Sedes: " + institucion.getNumeroSedes());
    }
}
