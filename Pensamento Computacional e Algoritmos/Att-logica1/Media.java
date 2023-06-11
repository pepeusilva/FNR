import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2*2 + nota3*3) / 6;
        String conceito;

        if (media >= 9.0) {
            conceito = "A";
        } else if (media >= 7.0) {
            conceito = "B";
        } else if (media >= 6.0) {
            conceito = "C";
        } else if (media >= 4.0) {
            conceito = "D";
        } else if (media < 4.0) {
            conceito = "E";
        } else {
            conceito = "E";
        }

        String resultado = "O conceito final do aluno é " + conceito + ".";
        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            resultado += " APROVADO!";
        } else {
            resultado += " REPROVADO!";
        }
        System.out.println(resultado);

        scanner.close();
    }
}
