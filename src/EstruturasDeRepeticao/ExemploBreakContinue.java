package EstruturasDeRepeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3){
                continue; //break ira até o numero 2
            }
            System.out.println(i);
        }
    }
}
