import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada: Temperatura inicial e unidade
        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();
        System.out.print("Digite a unidade (C para Celsius, F para Fahrenheit, K para Kelvin): ");
        String unidadeOrigem = scanner.next().toUpperCase();

        // Entrada: Unidade de destino
        System.out.print("Converter para (C para Celsius, F para Fahrenheit, K para Kelvin): ");
        String unidadeDestino = scanner.next().toUpperCase();

        // Conversão e saída
        try {
            double temperaturaConvertida = converterTemperatura(temperatura, unidadeOrigem, unidadeDestino);
            System.out.printf("A temperatura convertida é: %.2f %s\n", temperaturaConvertida, unidadeDestino);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    // Método de conversão
    public static double converterTemperatura(double temperatura, String origem, String destino) {
        if (origem.equals(destino)) {
            return temperatura; // Mesma unidade, retorna o valor original
        }

        switch (origem) {
            case "C": // Celsius para outras unidades
                return destino.equals("F") ? (temperatura * 9/5) + 32 :
                        destino.equals("K") ? temperatura + 273.15 : erroUnidade();
            case "F": // Fahrenheit para outras unidades
                return destino.equals("C") ? (temperatura - 32) * 5/9 :
                        destino.equals("K") ? (temperatura - 32) * 5/9 + 273.15 : erroUnidade();
            case "K": // Kelvin para outras unidades
                return destino.equals("C") ? temperatura - 273.15 :
                        destino.equals("F") ? (temperatura - 273.15) * 9/5 + 32 : erroUnidade();
            default:
                throw new IllegalArgumentException("Unidade de origem inválida: " + origem);
        }
    }

    // Método auxiliar para lançar erro de unidade
    private static double erroUnidade() {
        throw new IllegalArgumentException("Unidade de destino inválida.");
    }
}
