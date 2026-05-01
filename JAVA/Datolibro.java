import java.util.Scanner;

public class DatoLibro {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Como se llama tu libro favorito?: ");
        String usuario1 = entrada.nextLine();

        System.out.println("Como se llama el autor?: ");
        String titulo = entrada.nextLine();

        System.out.println("Tu libro favorito es: " + usuario1 + " y lo escribio " + titulo);

        entrada.close();
    }
}