public class SomaImpares {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 101; i <= 199; i += 2) {
            soma += i;
            System.out.print(i + " ");
        }

        System.out.println("\nSoma dos números ímpares: " + soma);
    }
}