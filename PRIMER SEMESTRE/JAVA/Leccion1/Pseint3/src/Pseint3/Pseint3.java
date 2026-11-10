
package Pseint3;
import java.util.Scanner;

public class Pseint3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double num1, num2, resultado;

        System.out.print("Digite el primer numero: ");
        num1 = teclado.nextDouble();

        System.out.print("Digite el segundo numero: ");
        num2 = teclado.nextDouble();

        if (num1 == num2) {
            resultado = num1 * num2;
        } else if (num1 > num2) {
            resultado = num1 - num2;
        } else {
            resultado = num1 + num2;
        }

        System.out.println("El resultado es: " + resultado);

        teclado.close();
    }
}
