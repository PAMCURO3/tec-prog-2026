//Clase 8 
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    private static float Calificacion1;
    private static float Calificacion2;
    private static float Calificacion3;
    private static float suma;

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
                
        System.out.println("Ingrese una calificación: ");
        Calificacion1 = entrada.nextFloat();
        System.out.println("Ingrese una segunda calificación: ");
        Calificacion2 = entrada.nextFloat();
        System.out.println("Ingrese una ultima calificación: ");
        Calificacion3 = entrada.nextFloat(); 
        
        suma = Calificacion1+Calificacion2+Calificacion3; 
        
        System.out.println("La suma de sus calificaciones es: " +suma);
    }
} 
