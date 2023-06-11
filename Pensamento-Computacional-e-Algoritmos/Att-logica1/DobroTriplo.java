import java.util.Scanner;

public class DobroTriplo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();
        
        
        
        int result;

        if (num >= 0) {
            result = num * 2;
        } else {
            result = num * 3;
        }

        System.out.println("Resultado: " + result);
    }
}
