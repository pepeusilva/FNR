import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();
        System.out.print("Digite a operação desejada (+, -, *, /): ");
        char operacao = sc.next().charAt(0);
        double resultado = 0;
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }
        System.out.println("O resultado da operação é: " + resultado);
        sc.close();
    }
}
