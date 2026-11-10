//Ejercicio Sacar el área de un Rectángulo
package ejerciciorectangulo;

import java.util.Scanner;

public class EjercicioRectangulo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el alto del rectangulo en cm: ");
        int alto = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite el ancho del rectangulo en cm: ");
        int ancho = Integer.parseInt(entrada.nextLine());

        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;

        System.out.println("El area del rectangulo es: " + area + "cm2");
        System.out.println("El perimetro del rectangulo es: " + perimetro + "cm");

        entrada.close();
    }
} 