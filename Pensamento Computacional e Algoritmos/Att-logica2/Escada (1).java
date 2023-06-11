import java.util.Scanner;

public class Escada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Digite um numero");

        int numeros = input.nextInt();

        input.close();

        System.out.println();
        for (int alto = 1; alto <= numeros; alto++) {
            
            for (int espacos = 1; espacos <= numeros - alto; espacos++) {
                System.out.print("");
            }
            for (int asteriscos = 1; asteriscos <= (alto * 1); asteriscos++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}