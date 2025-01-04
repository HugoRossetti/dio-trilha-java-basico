import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sigla = scanner.next().toUpperCase();
        switch (sigla) {
            case "P": {
                System.out.println("Pequeno");
                break;
            }
            case "M": {
                System.out.println("Medi");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
            default: {
                System.out.println("Indefinido");
            }
        }
    }
}
