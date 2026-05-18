import java.util.Scanner;

public class Cinco {

    public static void main(String args []) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = Integer.parseInt(scan.nextLine());

        int suma = 0;

        for(int i = 1; i <= numero; i++){

            System.out.println(i);
            suma += i;

        }

        System.out.println("\nLa suma es: " + suma);
           
    }

}