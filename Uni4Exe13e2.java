import java.util.Scanner;

public class Uni4Exe13e2 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Informe a carta 1:");
        int carta1 = tec.nextInt();
        System.out.println("Informe a carta 2:");
        int carta2 = tec.nextInt();
        System.out.println("Informe a carta 3:");
        int carta3 = tec.nextInt();

        int boas = 0;

        if (carta1 <= 3) {
            boas++;
        }
        if (carta2 <= 3) {
            boas++;
        }
        if (carta3 <= 3) {
            boas++;
        }

        switch (boas)

        {
            case 1:
                System.out.println("TRUCO");
                break;
            case 2:
                System.out.println("SEIS");
                break;
            case 3:
                System.out.println("NOVE");
                break;
        }

    }
}
