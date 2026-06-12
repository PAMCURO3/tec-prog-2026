
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

        //      var edadTexto = String.valueOf(10);
        //      System.out.println("edadTexto = " + edadTexto);
        //      var fraseChar = "Programadores".charAt(4);
        //      System.out.println("fraseChar = " + fraseChar);
        //       System.out.println("Digite un caracter: ");
//        fraseChar =entrada.nextLine().charAt(0);
        //       System.out.println("fraseChar = " + fraseChar); 
        //       Operdores aritméticos
        /*int num1 = 6 , num2 = 4; //No se puede asignar valor con la inferencia de tipo
          var solucion = num1 + num2;
         //System.out.println( num1 + num2);
          System.out.println("Solucion de la suma = " + solucion);
 
          
          solucion = num1 - num2;
          System.out.println("Solucion de la resta = " + solucion);
          
          solucion = num1 * num2;
          System.out.println("solucion de la multiplicacion es = " + solucion);
          
          solucion = num1 / num2;
          System.out.println("solucion de la division es = " + solucion);
          
          var solucion2 = 3.4 / num2;
          System.out.println("Solucion2 resultado de la division ="+solucion2);
          
          solucion = num1 % num2; //guarda el residuo entero de la division
          System.out.println("solucion = " + solucion);
          
          
          if (num1 % 2 == 0)
              System.out.println("El numero es PAR");
          else
              System.out.println("El numero es IMPAR");
          //aqui en esta estructura no se utiliza llave
          //solamente se hace un bloque de código
          //suma
          int varNum1 = 1, varNum2 = 4;
          int varNum3 = varNum1 + 6 - varNum2;
          System.out.println("varNum3 = "+ varNum3);
              //1+6-4=3
          varNum1 += 1; //varNum1 + varNum1 + 1;
          System.out.println("varNum1 = " + varNum1);
          
          //resta
          int varNum4 = 1, varNum5 = 4;
          int varNum6 = varNum4 - 6 - varNum5;
          System.out.println("varNum6 = "+ varNum6);
              //1 - 6 - 4 = -9
          varNum4 -= 1; //varNum4 + varNum4 + 1;
          System.out.println("varNum4 = " + varNum4);
         
          //multiplicacion
          int varNum7 = 1, varNum8 = 4;
          int varNum9 = varNum7 * 6 * varNum8;
          System.out.println("varNum9 = " + varNum9);
          varNum7 *= 1;
          System.out.println("varNum9 = " + varNum9);
          
          //division
          int varNum10 = 60, varNum11 = 4;
          int varNum12 = varNum10 / 6 / varNum11;
          System.out.println("varNum12 = " + varNum12);
          varNum10 %= 6; 
          System.out.println("varNum12 = " + varNum12);*/
        //Operadores Unarios- Cambio de signo
        /*var varA = 7;
          var varB = -varA;
          System.out.println("VarA = " + varA);
          System.out.println("varB = " + varB);//El resultado ser´un numero negativo
          
          //Operador de Negacion
          var varC = true; //esta literal por default en Java es de tipo booleano
          var varD = !varC; //aqui esta invirtiendo el valor
          System.out.println("varC = " + varC);
          System.out.println("varD = " + varD);
     
          //Operadores Unarios Incremento Decremento
          var varE = 11; //se va a modificar su valor
          var varF = ++varE;//simbolo antes de la variable
          //Primero se incrementa la variable y despues se usa su valor
          System.out.println("varE = " + varE);//se incrementa en la unidad
          System.out.println("varF = " + varF);// va a sumar uno
          //Postincremento del simbolo va despues de la variable
          var varG = 3;
          var varH = varG++;//primero el valor de la variable, luego el incremento
          System.out.println("varG = " + varG);
          System.out.println("varH = " + varH);  
          //Operadores unarios de decremento
          var varI = 4;
          var varJ = --varI;
          System.out.println("varI = " + varI);//la variable i ya va a estar con decremento
          System.out.println("varJ = " + varJ);
          //post decremento
          var varK = 8;
          var varL = varK--;
          System.out.println("varK = " + varK);
          System.out.println("varL = " + varL);*/
        //Operadores de igualdad y relacionales
        /*var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum); //los parentesis son opcionales
        System.out.println("cNum = " + cNum);

        //Operador de diferencia
        var dNum = aNum != bNum; //sin parentesis y no hay inconvenientes
        System.out.println("dNum = " + dNum);

        //Operadores con Cadena
        var cadenaA = "Hello";
        var cadenaB = "Hello";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);
        //equals comparacion de referencia de objetos 
        //viendo si los contenidos de cadena tipo 
        //string son iguales
        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);

        //Operadores relacionales mayor o menor
        var gVar = aNum != bNum; //relaciones de una variable y otra
        System.out.println("gVar = " + gVar);
        //Operadores relacionales > < <= >= !=
        /* var hVar = aNum > bNum;
          System.out.println("hVar = " + hVar);*/

 /*if (aNum % 2 == 0) {
            System.out.println("Tu numero es PAR");
        } else {
            System.out.println("Tu numero es IMPAR");
        }

        if (bNum % 2 == 0) {
            System.out.println("Tu numero es PAR");
        } else {
            System.out.println("Tu numero es IMPAR");
        }

        var edad = 15;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }*/
        //Operadores condicionales AND
        /*var valorA = 7;
        var valorMinimo = 0;//para crear un rango del 0 al 10
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;
        if (respuesta) {
            System.out.println("Esta dentro del rango establecido");
        } else {
            System.out.println("Esta fuera del rango establecido");
        }

        //Operadores condionales OR
        var vacaciones = false;
        var diaLibre = true;
        if (vacaciones || diaLibre) { // || operador OR condicional actua como uno u otro da un verdadero 
            System.out.println("Papa puede asistir al juego del hijo");
        } else {
            System.out.println("Papa no puede asistir al juego del hijo");
        }*/
        //Operador Ternario
        /*var resultadoT = (5 > 8) ? "verdadero" : "Falso";
        System.out.println("El resultado es: " + resultadoT);
        
        var numeroT = 7;
        resultadoT = (numeroT % 2 == 0) ? "Es Par" : "Es Impar";
        System.out.println("resultadoT = " + resultadoT);*/
        //Prioridad de Operadores
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x); //6
        System.out.println("y = " + y); //9
        System.out.println("z = " + z); //16 antes de restarle uno a "Y" sumo 10 +6 

        var solucionAritmetica = 4 + 5 * 6 / 3; //30/3 = 10 + 4 = 14
        System.out.println("solucionAritmetica = " + solucionAritmetica);

        solucionAritmetica = (4 + 5) * 6 / 3; // 18
        System.out.println("solucionAritmetica = " + solucionAritmetica);
                
    }

}
