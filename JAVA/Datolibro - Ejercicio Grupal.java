import java.util.Scanner;

public class DatoLibro {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el nombre del libre: ");
        String nombrelibro = entrada.nextLine();

        System.out.println("Digite el ID del libro: ");
        String idlibro = entrada.nextLine();

        System.out.println("Digite el precio del libro: ");
        String preciolibro = entrada.nextLine();

        
        System.out.println("Libro "+ nombrelibro + idlibro + preciolibro + envio " y lo escribio " + titulo);

        entrada.close();
    }
}