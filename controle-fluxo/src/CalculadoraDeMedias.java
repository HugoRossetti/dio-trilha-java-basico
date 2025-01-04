import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Hugo", "Fernanda", "Agata", "Nelson"};

        int media = calcularMediaDaTurma(alunos, scan);
        System.out.println(media);

    }
    public static int calcularMediaDaTurma(String[] alunos, Scanner scanner) {
        int soma = 0;
        for (String aluno : alunos) {
            System.out.println("Nota do aluno: " + aluno);
            int nota = scanner.nextInt();
            soma += nota;

        }
        return soma / alunos.length;
    }

}
