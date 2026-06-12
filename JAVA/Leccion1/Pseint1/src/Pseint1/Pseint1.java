package Pseint1;
import java.util.Scanner;

public class Pseint1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, nota3;
        double promedio;

        System.out.println("Digite las 3 calificaciones:");

        System.out.print("Nota 1: ");
        nota1 = entrada.nextDouble();

        System.out.print("Nota 2: ");
        nota2 = entrada.nextDouble();

        System.out.print("Nota 3: ");
        nota3 = entrada.nextDouble();

        promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 7) {
            System.out.println("El alumno esta aprobado con: " + promedio);
        } else {
            System.out.println("El alumno esta desaprobado con: " + promedio);
        }

        entrada.close();
    }
}