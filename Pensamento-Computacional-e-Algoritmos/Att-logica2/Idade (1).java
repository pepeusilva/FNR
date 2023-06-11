import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] idades = new int[12];

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a idade da pessoa " + (i+1) + ": ");
            idades[i] = input.nextInt();
        }

        int maiorIdade = idades[0];
        int menorIdade = idades[0];

        for (int i = 1; i < 12; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
            }
            if (idades[i] < menorIdade) {
                menorIdade = idades[i];
            }
        }

        System.out.println("A maior idade é: " + maiorIdade);
        System.out.println("A menor idade é: " + menorIdade);
    }
}