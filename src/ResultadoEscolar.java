import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;
        System.out.print("Digite sua nota: ");
        nota = sc.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota <= 4 && nota < 7 ) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
