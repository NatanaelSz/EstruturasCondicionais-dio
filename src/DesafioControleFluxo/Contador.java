package DesafioControleFluxo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm;
        while (true) {
            try {
                parametroUm = terminal.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite um número inteiro.");
                terminal.next();
            }
        }

        System.out.println("Digite o segundo parâmetro");
        int parametroDois;
        while (true) {
            try {
                parametroDois = terminal.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite um número inteiro.");
                terminal.next();
            }
        }

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + (parametroUm + i));
        }
    }

    static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String message) {
            super(message);
        }
    }
}
