package EstruturasCondicionais;

import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char sigla;
        sigla = sc.next().toUpperCase().charAt(0);

        switch (sigla) {
            case 'P': {
                System.out.println("Pequeno");
                break;
            }
            case 'M': {
                System.out.println("Medio");
                break;
            }
            case 'G': {
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("Indefinido");
        }

        sc.close();
    }
}
