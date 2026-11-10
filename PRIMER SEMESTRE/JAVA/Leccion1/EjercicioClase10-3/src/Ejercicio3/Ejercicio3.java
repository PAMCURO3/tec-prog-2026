/*Ejercicio 3: La calificacion final de un estudiante de informática

se calcula con base a las calificaciones de cuatro aspectos de su

rendimiento académico: participación, primer examen parcial, segundo

examen parcial y examen final. Sabiendo que las calificaciones anteriores

entran a la calificación final con ponderaciones de 10%, 25%, 25%

y 40%, Hacer un programa que calcule e imprima la calificación final

obtenida por un estudiante. 

Que el usuario digite las calificaciones de estos 4 datos y así podremos tener,

la calificación final.

*/
package Ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double participacion, parcial1, parcial2, examenFinal;
        double notaFinal;

        System.out.print("Digite la nota de participacion: ");
        participacion = entrada.nextDouble();

        System.out.print("Digite la nota del primer parcial: ");
        parcial1 = entrada.nextDouble();

        System.out.print("Digite la nota del segundo parcial: ");
        parcial2 = entrada.nextDouble();

        System.out.print("Digite la nota del examen final: ");
        examenFinal = entrada.nextDouble();

        notaFinal = (participacion * 0.10)
                  + (parcial1 * 0.25)
                  + (parcial2 * 0.25)
                  + (examenFinal * 0.40);

        System.out.println("\nLa calificacion final es: " + notaFinal);

        entrada.close();
    }
}