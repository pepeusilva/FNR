import java.util.Scanner;

public class SomaMulti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = input.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = input.nextInt();

        int c;
        String result;

        if (a > b) {
            c = a + b;
            result = "soma";
        } else {
            c = a * b;
            result = "multiplicação";
        }

        System.out.println("O resultado é: " + c);
        System.out.println("Caminho utilizado: " + result);
    }
}
