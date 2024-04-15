import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner e = new Scanner (System.in);
        System.out.println("Ingrese su nombre");
        String nombre;
        nombre = e.nextLine();

        System.out.println("Hola, "+nombre);
        e.close();

    }
}
