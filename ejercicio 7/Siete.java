import java.util.Scanner;

public class Siete {

    public static void main(String args []) {

        Scanner scan = new Scanner(System.in);

        int totalPares = 0;

        for(int i = 1; i <= 100; i++){

            if(i % 2 == 0){

                System.out.println(i);
                totalPares++;
                
            }

        }

        System.out.println("\nHay " + totalPares + " números pares de 1 a 100");

    }

}