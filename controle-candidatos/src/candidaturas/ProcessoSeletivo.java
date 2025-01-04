package candidaturas;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
       imprimirSelecionados();


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Processo Seletivo");
//        double salarioPretendido = scanner.nextDouble();
//        analisarCandidato(salarioPretendido);
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Ana", "Carlos", "Fernanda", "Lucas", "Maria"};

        System.out.println("Imprimindo a lista de candidatos informando o indice: ");

        for(int i = 0; i < candidatos.length; i++){
            System.out.println("O candidato de N " + (i + 1) + " é " + candidatos[i]);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Ana", "Carlos", "Fernanda", "Lucas", "Maria", "Pedro", "Joana", "Ricardo", "Paula", "Gabriel"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O Candidato: " + candidato + " Solicitou este valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO DEMAIS O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
