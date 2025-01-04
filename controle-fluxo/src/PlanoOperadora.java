import java.util.Scanner;

public class PlanoOperadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um plano: ");
        String plano = scanner.nextLine().toUpperCase(); //T = Turbo, M = Medio, B = Basic

        switch (plano) {
            case "T": {
                System.out.println("5gb Youtube");
                break;
            }
            case "M": {
                System.out.println("Whatsapp e Instagram grátis");
                break;
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
            default: {
                System.out.println("Não é um plano válido");
            }
        }
    }
}
