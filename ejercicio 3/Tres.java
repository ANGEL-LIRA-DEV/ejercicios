import java.util.Scanner;

public class Tres {

    public static void main(String args []) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = Integer.parseInt(scan.nextLine());

        if(numero == 0){

            System.out.println("\nEl número es 0");
            System.exit(0);

        } 
        
        if(numero % 2 == 0){

            System.out.println("\nEl número es par");

        } else if(numero > 0){

            System.out.println("\nEl número es impar");

        }

        if(numero < 0){

            System.out.println("El número es negativo");

        } else if(numero > 0){

            System.out.println("El número es positivo");

        }

    }

}