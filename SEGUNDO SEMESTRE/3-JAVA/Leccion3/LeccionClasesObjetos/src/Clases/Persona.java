/*Introduccion a clases y objetos

*/
package Clases;

// Importación obligatoria para usar ventanas emergentes
import javax.swing.JOptionPane;

public class Persona {
    public static void main(String[] args) {
   
        String person = "Pamela G.M. Cuello";
        while (person.equals("Pamela G.M. Cuello")) {
            JOptionPane.showMessageDialog(null, "Sus datos personales son: " + person);
            break;
        }

        String direccion = "Av. Leloir 261";
        while (direccion.equals("Av. Leloir 261")) {
            JOptionPane.showMessageDialog(null, "Su direccion es: " + direccion);
            break;
        }
        
        String trabajo = "Coordinadora QAQC";
        while (trabajo.equals("Coordinadora QAQC")) {
            JOptionPane.showMessageDialog(null, "Su trabajo actual es: " + trabajo);
            break;
        }
        
        String dni = "35663726";
        while (dni.equals("35663726")) {
            JOptionPane.showMessageDialog(null, "Su DNI es: " + dni);
            break;
        }
    }
}
