import java.util.Scanner;

public class Uni4Exe22 {

    public static void main(String[] args) {

        // inserir o teclado
        Scanner tec = new Scanner(System.in);

        // ler a opção
        System.out.println("Digite a opção 1, 2 ou 3");
        int opcao = tec.nextInt();

        // escolher a opção
        switch (opcao) {
            case 1:
                System.out.println("Bacharel em Ciência da Computação");
                break;
            case 2:
                System.out.println("Bacharel em Ciência de Dados");
                break;
            case 3:
                System.out.println("Bacharel em Sistemas da Informação");
                break;
            default:
                System.out.println("Curso não encontrado");
        }
    }
}