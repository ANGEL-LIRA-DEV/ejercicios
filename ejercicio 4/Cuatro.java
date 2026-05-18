import java.util.Scanner;

public class Cuatro {

    public static void main(String args []) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresa número 1: ");
        int a = Integer.parseInt(scan.nextLine());

        System.out.print("Ingresa número 2: ");
        int b = Integer.parseInt(scan.nextLine());

        System.out.print("Ingresa número 3: ");
        int c = Integer.parseInt(scan.nextLine());

        int mayor = Math.max(a, Math.max(b, c));

        System.out.println("\nEl número mayor es: " + mayor);

        if(a == b || a == c){

            System.out.println("Hay números iguales entre ellos");

        }
        
    }

}