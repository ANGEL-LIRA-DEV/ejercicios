import java.util.Scanner;

public class Uno {

    public static void main(String args []) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scan.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = Integer.parseInt(scan.nextLine());

        System.out.print("¿Ya pasó tu cumpleaños? (S/N): ");
        char respuesta = scan.nextLine().charAt(0);

        int anioNacimiento = 2026 - edad;

        if(respuesta == 'N'){

            anioNacimiento--;

        }
        
        System.out.println("\nHola " + nombre + ". Tienes " + edad + " años. ¡Bienvenido a Java!, naciste en el año " + anioNacimiento);

    }

}