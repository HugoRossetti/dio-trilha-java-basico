package pessoafisica;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("hugo", "03139089236");

        marcos.setEndereco("RUA DAS MARIAS");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());

    }
}
