import java.util.Scanner;
	
    public class HelloWolrd {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Qual é o seu nome? ");
            String nome = scanner.nextLine();
            
            System.out.print("Quantos anos você tem? ");
            int idade = scanner.nextInt();
            
            System.out.println("Opa " + nome + ", você tem " + idade + " anos.");
    }
}