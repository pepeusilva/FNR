import java.util.Scanner;

public class ProgramaCompra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor original do produto: ");
        double valorOriginal = scanner.nextDouble();
        System.out.print("Digite a forma de pagamento (1 - à vista, 2 - pix, 3 - débito, 4 - crédito à vista, 5 - crédito parcelado): ");
        int formaPagamento = scanner.nextInt();
        double valorFinal = 0;

        switch (formaPagamento) {
            case 1:
            case 2:
            case 3:
                valorFinal = calcularValorComDesconto(valorOriginal);
                break;
            case 4:
                valorFinal = valorOriginal;
                break;
            case 5:
                valorFinal = calcularValorComJuros(valorOriginal, scanner);
                break;
            default:
                System.out.println("Opção inválida. Por favor, digite um número entre 1 e 5.");
                break;
        }

        System.out.println("O valor final do produto é R$" + valorFinal + ".");
        scanner.close();
    }

    private static double calcularValorComDesconto(double valorOriginal) {
        return valorOriginal * 0.9;
    }

    private static double calcularValorComJuros(double valorOriginal, Scanner scanner) {
        System.out.print("Digite a quantidade de parcelas: ");
        int quantidadeParcelas = scanner.nextInt();
        double taxaJuros = 0.1;
        double juros = valorOriginal * taxaJuros * quantidadeParcelas;
        return valorOriginal + juros;
    }
}
