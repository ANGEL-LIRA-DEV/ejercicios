import java.util.Scanner;

public class Seis {

    public static void main(String args []) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = Integer.parseInt(scan.nextLine());

        System.out.print("Hasta que tabla mostrar [1-10]: ");
        int tablaLimite = Integer.parseInt(scan.nextLine());

        System.out.print("\n");

        int j = 1;
        while(j <= tablaLimite){

            System.out.println(numero + " X " + j + " = " + (numero * j));
            j++;

        }

    }

}