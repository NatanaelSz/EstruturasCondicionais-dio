package EstruturasDeRepeticao;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.printf("\nDoce do valor: %.2f Adicionado no carrinho", valorDoce);
            mesada = mesada - valorDoce;
        }
        System.out.printf("\nMesada %.2f", mesada);
        System.out.println("\nJoão gastou toda sua mesada");

    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}


