package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno hugo = new Aluno();

        hugo.setNome("hugo daniel");
        hugo.setIdade(22);

        System.out.println("O aluno " + hugo.getNome() + " tem " + hugo.getIdade() + " anos");
    }
}
