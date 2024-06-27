import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;
        System.out.print("Digite sua nota: ");
        nota = sc.nextDouble();

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        sc.close();
    }
}
