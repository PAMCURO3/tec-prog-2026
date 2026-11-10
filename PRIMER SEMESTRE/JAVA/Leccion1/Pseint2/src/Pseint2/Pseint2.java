
package Pseint2;
import java.util.Scanner;

public class Pseint2 {
    
     public static void main(String[] args) {

           Scanner teclado = new Scanner(System.in);

        double compra;
        double descuento;
        double precioFinal;

        System.out.print("Digite el monto de la compra: ");
        compra = teclado.nextDouble();

        if (compra > 100) {
            descuento = compra * 0.20;
        } else {
            descuento = 0;
        }

        precioFinal = compra - descuento;

        System.out.println("El precio a pagar es: $" + precioFinal);

        teclado.close();
    }
}