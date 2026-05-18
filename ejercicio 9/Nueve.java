import java.util.Scanner;

public class Nueve {

    public static void main(String args []) {

        Scanner scan = new Scanner(System.in);

        int numero = (int) (Math.random() * 50) + 1;

        int intentos = 0;

        int supuesto;

        do{

            System.out.print("\n¿Qué número crees que sea?: ");
            supuesto = Integer.parseInt(scan.nextLine());

            if(supuesto > numero){

                System.out.println("El número es más pequeño");

            } else if(supuesto < numero){

                System.out.println("El número es más grande");

            }

            intentos++;

        } while(supuesto != numero);

        System.out.println("\nEl número aleatorio era: " + numero);
        System.out.println("Lo adivinaste en " + intentos + " intentos");
        
    }

}