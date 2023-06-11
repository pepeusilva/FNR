import java.util.Scanner;

public class CNH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int peso;
        int veiculo;
        int pessoas;

        System.out.println("Quantas rodas possuem o veiculo?");
        veiculo = input.nextInt();

        System.out.println("Quantas pessoas cabem nele?");
        pessoas = input.nextInt();

        System.out.println("Quanto o veiculo consegue suportar de peso");
        peso = input.nextInt();

        String categoria = "";

        if (veiculo <= 3) {
            categoria = "A - moto ou tricicolo";
        } else if (veiculo <= 4)
        if (pessoas >= 4)
            if (peso <= 3500) {
                categoria = "B - Carro";
        } else if (veiculo >= 4)
            if (peso <= 6000) {
                categoria = "C - Carga ";
        } else if (veiculo >= 4)
            if (pessoas >= 8) {
                categoria = "D - Micro-Onibus";
        } else if (veiculo >= 4)
            if (peso >= 6000) {
                categoria = "E - Geral é mais um pouco";
        }

        System.out.println("Olá " + " a categoria do veiculo é : " + categoria + "  Quantidade de passageiros maximo de "+ pessoas + " Obrigado, por participar da pesquisa ");
        input.close();

    }

}