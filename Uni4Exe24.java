import java.util.Scanner;

public class Uni4Exe24 {

    public static void main(String[] args) {

        // inserir o teclado
        Scanner tec = new Scanner(System.in);

        // ler os valores
        System.out.println("Informe o Valor 1:");
        int valor1 = tec.nextInt();
        System.out.println("Informe o Valor 2:");
        int valor2 = tec.nextInt();
        System.out.println("Informe o Valor 3:");
        int valor3 = tec.nextInt();
        System.out.println("Informe a opção desejada:");
        System.out.println("1) Valoeres em ordem Crescente.");
        System.out.println("2) Valoeres em ordem Decrescente.");
        System.out.println("3) Maior valor no meio.");
        int opcao = tec.nextInt();

        // Descobrir qual número é o maior, do meio, e menor
        int maior, meio, menor;

        if (valor1 <= valor2 && valor1 <= valor3) {
            menor = valor1;
            if (valor2 <= valor3) {
                meio = valor2;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor2;
            }
        } else if (valor2 <= valor1 && valor2 <= valor3) {
            menor = valor2;
            if (valor1 <= valor3) {
                meio = valor1;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor1;
            }
        } else {
            menor = valor3;
            if (valor1 <= valor2) {
                meio = valor1;
                maior = valor2;
            } else {
                meio = valor2;
                maior = valor1;
            }
        }

        // escolher a opção
        switch (opcao) {
            case 1: // %d serve para escrever números inteiros
                System.out.printf("%d - %d - %d\n", menor, meio, maior);
                break;
            case 2:
                System.out.printf("%d - %d - %d\n", maior, meio, menor);
                break;
            case 3:
                System.out.printf("%d - %d - %d\n", menor, maior, meio);
                break;
            default:
        }
    }
}