//El mayor de dos numeros
package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = entrada.nextInt();

        if (num1 > num2) {
            System.out.println("El numero mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El numero mayor es: " + num2);
        } else {
            System.out.println("Ambos numeros son iguales.");
        }

        entrada.close();
    }
}
