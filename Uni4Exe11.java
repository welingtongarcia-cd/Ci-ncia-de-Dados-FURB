import java.util.Scanner;

public class Uni4Exe11 {

    public static void main(String[] args) {

        // Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escreva uma
        // mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS. Considere
        // que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente
        // dos demais, e apenas irmãos se todas as idades foram diferentes.

        // inserir teclado
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite a idade do irmão 1: ");
        int irmao1 = tec.nextInt();
        System.out.println("Digite a idade do irmão 2: ");
        int irmao2 = tec.nextInt();
        System.out.println("Digite a idade do irmão 3: ");
        int irmao3 = tec.nextInt();

        if (irmao1 == irmao2 && irmao1 == irmao3 && irmao2 == irmao3) {
            System.err.println("TRIGÊMEOS");
        } else if (irmao1 == irmao2 || irmao1 == irmao3 || irmao2 == irmao3) {
            System.out.println("GÊMEOS");
        } else {
            System.out.println("APENAS IRMÃOS");
        }
    }
}