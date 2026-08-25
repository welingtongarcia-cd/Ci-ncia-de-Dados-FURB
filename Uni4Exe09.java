import java.util.Scanner;

public class Uni4Exe09 {

    public static void main(String[] args) {

        // Dados dois valores inteiros, escreva um algoritmo que informe se eles são
        // múltiplos ou não.

        // inserir teclado
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numero1 = tec.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = tec.nextInt();



        // Testar se os números são múltiplos
        if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }
    }
}