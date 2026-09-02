import java.util.Scanner;

public class Uni4Exe13 {

    public static void main(String[] args) {

        // inserir o teclado
        Scanner tec = new Scanner(System.in);

        // inserir as variaveis
        System.out.println("Informe a carta 1:");
        int carta1 = tec.nextInt();
        System.out.println("Informe a carta 2:");
        int carta2 = tec.nextInt();
        System.out.println("Informe a carta 3:");
        int carta3 = tec.nextInt();

        int boas = 0;

        // ++ serve para somar 1 a variavel criada 
        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            boas++;
        }
        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            boas++;
        }
        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            boas++;
        }
        if (boas == 1) {
            System.err.println("TRUCO");
        } else if (boas == 2) {
            System.out.println("SEIS");
        } else if (boas == 3) {
            System.out.println("NOVE");
        } else {
            System.err.println("-");
        }
    }
}