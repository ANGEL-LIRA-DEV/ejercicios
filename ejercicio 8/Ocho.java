import java.util.Scanner;

public class Ocho {

    public static void main(String args []) {

        Scanner scan = new Scanner(System.in);

        int totalNumeros = 0;
        int suma = 0;

        String respuesta;

        do{

            System.out.print("\nIngresa un número: ");
            int numero = Integer.parseInt(scan.nextLine());

            totalNumeros++;
            suma += numero;

            System.out.print("¿Deseas continuar (si/no)?: ");
            respuesta = scan.nextLine();

        }
        while(!respuesta.equals("no"));

        System.out.println("\nSe ingresaron: " + totalNumeros + " números en total");
        System.out.println("El resultado de la suma es: " + suma);

    }

}