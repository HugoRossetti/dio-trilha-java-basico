public class SomaNumerosInteiros {
    public static void main(String[] args) {
        int numero = 10;
        int soma = 0;
        int contador = 1;

        // Laço do-while para iterar e acumular a soma dos números
        do {
            soma += contador;
            contador++;
        } while (contador <= numero);

        // Exibe o resultado da soma
        System.out.println("A soma dos primeiros " + numero
                + " números inteiros positivos é: " + soma);
    }
}
