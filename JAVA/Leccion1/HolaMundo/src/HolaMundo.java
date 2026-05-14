
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
            /*System.out.println("Hola Mundo desde Java");  
        
        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        //Tipo String
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programación";
        System.out.println(miVariableCadena);
             */
            //Var- Inferencia tipos en Java
            /*var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        //soutv + tab    
        //para ejecutar shift + F6
        //Reglas para definir una variable en Java

        //no se pueden iniciar con numeros o con caracteres especiales, 
        //si puede tener guion bajo y el del peso
        //Se recomienda no poner acentos o tildes aunque el programa lo permita
        //no se puede utilizar el # para colocar una variable porque es ILEGAL
        //VAMOS A CONCATENAR
        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + "" + usuario;
        System.out.println("union = " + union);

        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));
        //Ejercicio: Caracteres especiales con Java
        var nombre = "Natalia";
        System.out.println("\nNueva linea: \n" + nombre);//diagonal inversa y letra n
        System.out.println("Tabulador: \t" + nombre);//tabulador un espacio para centrar
        System.out.println("\t\t: MENU:.");
        System.out.println("retroseso: \b\b"+ nombre); //caracter de retroseso
        System.out.println("Comillas Simples: \'"+ nombre+"\'");
        System.out.println("Comillas doblres: \""+nombre+"\"");*/

            //Clase scanner
            /*Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el título: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: "+titulo2+" "+usuario2);*/
 /* byte numEnteroByte = (byte)127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del byte: "+ Byte.MIN_VALUE);
        System.out.println("Valor maximo del byte: "+ Byte.MAX_VALUE);
        
        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del short: "+ Short.MIN_VALUE);
        System.out.println("Valor maximo del short: "+ Short.MAX_VALUE);
        
        int numEnteroInt = 2147483647;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del int: "+ Integer.MIN_VALUE);
        System.out.println("Valor maximo del int: "+ Integer.MAX_VALUE);
        
        long numEnteroLong = 9223372036854775807L;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor minimo del Long: "+ Long.MIN_VALUE);
        System.out.println("Valor maximo del Long: "+ Long.MAX_VALUE);*/
 /*float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor minimo de float: " + Float.MIN_VALUE);
        System.out.println("El valor maximo de float: " + Float.MAX_VALUE);
        double numDouble = 1.7976931348623157E308;
        System.out.println("numDouble = " + numDouble);
        System.out.println("El valor minimo de Double: " + Double.MIN_VALUE);
        System.out.println("El valor maximo de Double: " + Double.MAX_VALUE);*/
        //Inferencia de tipos var y tipos primitivos
        //Las literales sin punto automáticamente son de tipo int
        /*var numEntero = 20;
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0F; //automaticamente con el punto decimal se convierte en double
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);*/
        //Tipor Primitivos char puede almacenar 1 solo caracter y lo hace con comillas
        /*char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        
        char varCaracter = '\u0024'; //Indicamos a java la asignación con el código unicode
        System.out.println("varCaracter = " + varCaracter);    
        char varCaracterDecimal = 36; //Valor decimal del juego de caracter
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char VarCaracterSimbolo = '$'; //un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("VarCaracterSimbolo = " + VarCaracterSimbolo);
        //Cualquier caracter que no tengamos lo podemos copiar del unicode. 
        
        var varCaracter1 = '\u0024'; //Indicamos a java la asignación con el código unicode
        System.out.println("varCaracter1 = " + varCaracter1);    
        var varCaracterDecimal1 = (char)36; //Valor entero y le asigna un tipo int
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        var VarCaracterSimbolo1 = '$'; //un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("VarCaracterSimbolo1 = " + VarCaracterSimbolo1);
        
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);
        */
        
        //tipos primitivos tipos booleanos
        /*boolean varBool = true;
        System.out.println("varBool = " + varBool);
        
        if(varBool){
            System.out.println("La bandera es verde");  
        }   
        else {
             System.out.println("La bandera es roja");   
        }
               
        //Algoritmo: ¿Es mayor de edad?
        var edad = 18; //literal tener presente la inferencia de tipos
        var adulto = edad >= 18; //Esta es la expresión booleana
        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }  */
        //conversión de tipos primitivos
       /* var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad +1)); 
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);*/
        
        //Pedir un valor
        var entrada = new Scanner(System.in);
//            System.out.println("Digite su edad");
//        edad = Integer.parseInt(entrada.nextLine());
//            System.out.println("edad = " + edad );
//        var adulto = edad >= 18;
//        if (edad >=18){
//            System.out.println("Sos mayor de edad");
//        }else{
//            System.out.println("Sos menor de edad");
//        }*/
        //Convertir tipos primitivos en java parte 2
        // de un tipo entero a un tipo string
       
       var edadTexto = String.valueOf(10);
       System.out.println("edadTexto = " + edadTexto);
       
       var fraseChar = "Programadores".charAt(4);
       System.out.println("fraseChar = " + fraseChar);
       
        System.out.println("Digite un caracter: ");
        fraseChar =entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar); 
         
    }
} 