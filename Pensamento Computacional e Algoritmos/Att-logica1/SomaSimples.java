import java.util.Scanner;
    public class SomaSimples {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Digite o primeiro valor: ");
            int valor1 = scanner.nextInt();
        
            System.out.print("Digite o segundo valor: ");
            int valor2 = scanner.nextInt();
        
            int soma = valor1 + valor2;
            System.out.println("A soma de " + valor1 + " e " + valor2 + " é igual a " + soma + ".");
    }
}
