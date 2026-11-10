//Ejercicio 1: Construir un programa que, dado un número total de

//horas, devuelve el número de semanas, días y horas equivalentes.

//Por ejemplo dado un total de 1000 horas debe mostrar 5 semanas,

//6 días y 16 horas.


package EjercicioHoras;

import java.util.Scanner;

public class EjercicioHoras {
    public static void main(String[] args) {
        

        Scanner entrada = new Scanner(System.in);
        
        //una semana tiene un total de 168 horas 7 dias por 24 horas
// debo buscar el equivalente de las horas representado en semanas por lo que horas / 168
        int horasTotales;
        int semanas, dias, horas;

        System.out.print("Digite el número total de horas: ");
        horasTotales = entrada.nextInt();

        semanas = horasTotales / 168; // 7 * 24

        dias = (horasTotales % 168) / 24;

        horas = (horasTotales % 168) % 24;

        System.out.println("\nEquivale a:");
        System.out.println(semanas + " semanas");
        System.out.println(dias + " dias");
        System.out.println(horas + " horas");

        entrada.close();
    }
}
   
