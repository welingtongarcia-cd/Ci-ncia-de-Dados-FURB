import java.util.Scanner;

public class Uni4Exe10 {

    public static void main(String[] args) {

        // Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um
        // algoritmo para ler as idades dos filhos e exibir quem é a caçula da família;
        // suponha que não haja empates.

        //Inserir teclado
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite a idade do Marquinhos: ");
        int marquinhos = tec.nextInt();
        System.out.println("Digite a idade do Zezinho: ");
        int zezinho = tec.nextInt();
        System.out.println("Digite a idade da Luluzinha: ");
        int luluzinha = tec.nextInt();

        if (marquinhos<zezinho && marquinhos<luluzinha) {
            System.out.println("Marquinhos é o caçula!");
        } else if (zezinho<luluzinha) {
            System.out.println("Zezinho é o caçula!");
        } else {
            System.out.println("Luzulinha é a caçula!");
        }
    }
}