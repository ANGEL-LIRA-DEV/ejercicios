import java.util.Scanner;

public class Dos {

    public static void main(String args []) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresa número 1: ");
        int a = Integer.parseInt(scan.nextLine());

        System.out.print("Ingresa número 2: ");
        int b = Integer.parseInt(scan.nextLine());

        System.out.print("\nIngresa un signo para realizar la operación [+, -, *, /]: ");
        char signoOperacion = scan.nextLine().charAt(0);

        if(signoOperacion == '/' && b == 0){

            System.out.println("\nNo se puede dividir por cero");
            System.exit(0);

        }

        float resultado = 0;
        switch(signoOperacion){

            case '+':
            resultado = a + b;
            break;
            
            case '-':
            resultado = a - b;
            break;
            
            case '*':
            resultado = a * b;
            break;
            
            case '/':
            resultado = a / b;
            break;

            default:
            System.out.println("\nOperación no válida");

        }

        System.out.println("\nEl resultado es: " + resultado);

    }

}