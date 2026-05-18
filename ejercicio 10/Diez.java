import java.util.Scanner;

public class Diez {

    public static void main(String args []) {

        Scanner scan = new Scanner(System.in);

        int opcion;

        do{

            System.out.println("\nMENÚ DE OPCIONES\n");

            System.out.println("1) Sumar dos números");
            System.out.println("2) Restar números");
            System.out.println("3) Multiplicar números");
            System.out.println("4) SALIR");

            System.out.print("\nIngresa una opción [1-4]: ");
            opcion = Integer.parseInt(scan.nextLine());

            float resultado = 0;

            int a = 0;
            int b = 0;

            if(opcion != 4){

                System.out.print("\nIngresa número 1: ");
                a = Integer.parseInt(scan.nextLine());

                System.out.print("Ingresa número 2: ");
                b = Integer.parseInt(scan.nextLine());

            }

            switch(opcion){

                case 1:
                resultado = a + b;
                break;
                
                case 2:
                resultado = a - b;
                break;

                case 3:
                resultado = a * b;
                break;

                case 4:
                System.exit(0);
                break;

                default:
                System.out.println("\nOpción no válida");

            }

            System.out.println("\nEl resultado es: " + resultado);

        } while(opcion != 4);     

    }

}