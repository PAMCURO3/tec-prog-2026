package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

        private static float guillermo;
        private static float luis; 
        private static float juan; 
        private static float suma;
        private static float division; 
        private static float division2;
        
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        //Acá ingreso el total de Guillermo        
        System.out.println("Dinero de Guillermo: ");
        guillermo = entrada.nextFloat();
        //Acá obtengo el valor de Luis      
        luis = guillermo /2;
        System.out.println("Luis tiene:$ "+luis);
        
        //Acá debo sumar a Guillermo y Luis
        suma = guillermo + luis;
        System.out.println("Luis y Guillermo juntos tienen:$ "+ suma);
        
        division2 = suma/2;
        System.out.println("Juan tiene:$ "+division2);
        
        
    } 
    
}
