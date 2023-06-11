import java.util.Scanner;
    public class ConversorTemperatura {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a temperatura a ser convertida: ");
        double temperaturaOrigem = scanner.nextDouble();
    
        System.out.print("Digite a unidade de medida da temperatura de origem (C/F/K): ");
        String unidadeOrigem = scanner.next();
    
        System.out.print("Digite a unidade de medida da temperatura de conversão (C/F/K): ");
        String unidadeConversao = scanner.next();
    
        double temperaturaCelsius = 0.0;
        if (unidadeOrigem.equalsIgnoreCase("C")) {
            temperaturaCelsius = temperaturaOrigem;
        } else if (unidadeOrigem.equalsIgnoreCase("F")) {
            temperaturaCelsius = (temperaturaOrigem - 32) / 1.8;
        } else if (unidadeOrigem.equalsIgnoreCase("K")) {
            temperaturaCelsius = temperaturaOrigem - 273.15;
        }
    
        double temperaturaConversao = 0.0;
        if (unidadeConversao.equalsIgnoreCase("C")) {
            temperaturaConversao = temperaturaCelsius;
        } else if (unidadeConversao.equalsIgnoreCase("F")) {
            temperaturaConversao = temperaturaCelsius * 1.8 + 32;
        } else if (unidadeConversao.equalsIgnoreCase("K")) {
            temperaturaConversao = temperaturaCelsius + 273.15;
        }
    
        
        System.out.println("Temperatura convertida: " + temperaturaConversao + " " + unidadeConversao);
    
        scanner.close();
    }
}
