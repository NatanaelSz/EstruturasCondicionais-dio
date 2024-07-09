package Candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentado = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentado = !atendeu;
            if (continuarTentado) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato Realizado com Sucesso");
            }
        } while (continuarTentado && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.printf("Conseguimos contato com %s na %d tentativa\n", candidato, tentativasRealizadas);
        } else {
            System.out.printf("Não conseguimos contato com %s, número maximo tentativas %d realizadas\n", candidato, tentativasRealizadas);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo lista de candidatos informando o indice do elemento: ");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.printf("O candidato de Número: %d é %s\n", i+1, candidatos[i]);
        }
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s Solicitou este valor de salario %.2f\n", candidato, salarioPretendido);
            if (salarioBase > salarioPretendido) {
                System.out.println("O candidato " + candidato + " Foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
     return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra Proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais Candidatos");
        }
    }
}
