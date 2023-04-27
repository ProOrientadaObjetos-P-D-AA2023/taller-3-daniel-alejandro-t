package problema1.paquete1;

import java.util.Scanner;

import problema1.paquete2.Terreno;

public class Ejecutor {

    public static void main (String [] args){
        Terreno terreno1 = new Terreno(10, 20, 100);
        Terreno terreno2 = new Terreno(20, 30, 200);
        Terreno terreno3 = new Terreno(30, 40, 300);
        Terreno terreno4 = new Terreno(40, 50, 400);
        Terreno terreno5 = new Terreno(50, 60, 500);
        
        System.out.println("Terreno 1");
        System.out.println("Area: " + terreno1.calcularArea());
        System.out.println("Costo: " + terreno1.calcularCosto());
        System.out.println("Terreno 2");
        System.out.println("Area: " + terreno2.calcularArea());
        System.out.println("Costo: " + terreno2.calcularCosto());
        System.out.println("Terreno 3");
        System.out.println("Area: " + terreno3.calcularArea());
        System.out.println("Costo: " + terreno3.calcularCosto());
        System.out.println("Terreno 4");
        System.out.println("Area: " + terreno4.calcularArea());
        System.out.println("Costo: " + terreno4.calcularCosto());
        System.out.println("Terreno 5");
        System.out.println("Area: " + terreno5.calcularArea());
        System.out.println("Costo: " + terreno5.calcularCosto());
    }
    
}
