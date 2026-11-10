//Clase 8
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
                    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        final int salarioBase = 1000;
        
        int carrosVendidos;
        float valorCarro, comisionCarro, comisionVentas, salarioTotal;
        
        System.out.println("Digite la cantidad de carros vendidos: ");
        carrosVendidos = (entrada.nextInt());
        
        System.out.println("Ingrese el valor total de las ventas: ");
        valorCarro = (entrada.nextInt());
        
        comisionCarro = 150 * carrosVendidos;
        
        comisionVentas = 0.05f * valorCarro;
        
        salarioTotal = salarioBase + comisionCarro + comisionVentas;
        System.out.println("El salario mensual es:$ "+salarioTotal); 
    }
     
} 
