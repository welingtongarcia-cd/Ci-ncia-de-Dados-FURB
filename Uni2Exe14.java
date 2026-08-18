import java.util.Scanner;

public class Uni2Exe14 {

    public static void main(String[] args) {
        
        //Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

        //definir as variaveis
        int valor, notas100, notas50, notas20, notas10, notas5, notas2, notas1;

        //definir teclado
        Scanner tec = new Scanner(System.in);

        //ler valor
        System.out.println("Informe o valor");
        valor = tec.nextInt();

        //definir variaveis
        notas100 = valor/100;
        notas50 = valor%100/50;
        notas20 = valor%100%50/20;
        notas10 = valor%100%50%20/10;
        notas5 = valor%100%50%20%10/5;
        notas2 = valor%100%50%20%10%5/2;
        notas1 = valor%100%50%20%10%5%2/1;

        //escrever valor
        System.out.println("Notas de 100 : " + notas100);
        System.out.println("Notas de 50 : " + notas50);
        System.out.println("Notas de 20 : " + notas20);
        System.out.println("Notas de 10 : " + notas10);
        System.out.println("Notas de 5 : " + notas5);
        System.out.println("Notas de 2 : " + notas2);
        System.out.println("Notas de 1 : " + notas1);


    }

}
