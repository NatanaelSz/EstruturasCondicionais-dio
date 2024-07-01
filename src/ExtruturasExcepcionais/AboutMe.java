package ExtruturasExcepcionais;

import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome, sobreNome;
        int idade;
        double altura;

        System.out.println("Digite seu nome: ");
        nome = sc.next();

        System.out.println("Digite seu sobrenome");
        sobreNome = sc.next();

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.println("Digite sua altura");
        altura = sc.nextDouble();

        System.out.println("Ola me chamo:" + nome.toUpperCase() + " " + sobreNome.toUpperCase());
        System.out.println("Tenho: " + idade + " Anos ");
        System.out.println("Minha altura é: " + altura + "cm ");
        System.out.println();


        sc.close();
    }
}
