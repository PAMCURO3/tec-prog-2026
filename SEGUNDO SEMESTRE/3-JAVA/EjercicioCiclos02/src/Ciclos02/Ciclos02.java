/*
Ejercicio 2: Leer un numero e indicar si es positivo o
negativo.El proceso se repetirá hasta que se introduzca un cero
Hacer esto con la clase scanner,
luego hacerlo nuevamente con la clase JOptionPane
 */
package Ciclos02;
import javax.swing.JOptionPane;
public class Ciclos02 {
    public static void main(String[] args) {  
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(numero != 0){
            if(numero > 0){
                JOptionPane.showMessageDialog(null, "El numero es "+numero+" POSITIVO");
            }
            else{
                JOptionPane.showMessageDialog(null, "El numero es "+numero+" NEGATIVO");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero "));
            }
        JOptionPane.showMessageDialog(null, "El numero "+numero+" finaliza el programa");
        }
    }
 