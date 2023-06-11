import java.util.Scanner;

public class ConverterBinario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = input.nextInt();
        String binario = "";

        while (num > 0) {
            int resto = num % 2;
            num /= 2;
            binario = resto + binario;
        }

        System.out.println("O número " + num + " em binário é: " + binario);
    }
}