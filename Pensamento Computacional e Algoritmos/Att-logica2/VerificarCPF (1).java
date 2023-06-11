import java.util.Scanner;

public class VerificarCPF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número do CPF (somente os dígitos): ");
        String cpf = input.next();
        cpf = String.format("%011d", Long.parseLong(cpf));
        int digito1 = calcularDigito(cpf.substring(0, 9));
        int digito2 = calcularDigito(cpf.substring(0, 9) + digito1);

        if (cpf.equals(cpf.substring(0, 9) + digito1 + digito2)) {
            System.out.println("CPF válido.");
        } else {
            System.out.println("CPF inválido. O CPF correto é: " + cpf.substring(0, 9) + digito1 + digito2);
        }
    }

    private static int calcularDigito(String str) {
        int soma = 0;
        for (int i = 0; i < str.length(); i++) {
            soma += Character.getNumericValue(str.charAt(i)) * (i+1);
        }
        int digito = soma % 11;
        if (digito == 10) {
            digito = 0;
        }
        return digito;
    }
}
