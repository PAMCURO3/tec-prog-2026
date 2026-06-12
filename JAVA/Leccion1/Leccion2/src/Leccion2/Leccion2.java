package Leccion2;

import java.util.Scanner;

public class Leccion2 {

    public static void main(String[] args) {
        
        /*var condicion = false;
        if (condicion) {
            System.out.println("Condicion Verdadera");//Condicional simple
        } else {
            System.out.println("Condicion Falsa");//condicional doble
        }

        var numero = 4;

        var numeroTexto = "Numero desconocido";

        if (numero == 1) {
            numeroTexto = "Numero uno";
        } else if (numero == 2) {
            numeroTexto = "Numero dos";
        } else if (numero == 3) {
            numeroTexto = "Numero tres";
        } else if (numero == 4) {
            numeroTexto = "Numero cuatro";
        } else {
            numeroTexto = "Numero no encontrado";
        }
            System.out.println("numeroTexto = " + numeroTexto);*/
        //Sentencia de control Switch
        //var numero = 2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero del 1 al 4 ");
        int numero = Integer.parseInt(entrada.nextLine());
        
        var numeroTexto = "Valor desconocido";
        switch (numero) {
            case 1:
                numeroTexto = "Nummero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
                
            default:
                numeroTexto = "Numero no encontrado";
        }
        
                System.out.println("numeroTexto = " + numeroTexto);
                
                entrada.close(); 
                
        }

    }
