import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.println("Digite o numero");
        numero = input.nextInt();

            for (int i = 1; i < 11; i++) {
                System.out.println(numero + " x " + i + " = " + numero * i);
                input.close();
            

        }
    }

}