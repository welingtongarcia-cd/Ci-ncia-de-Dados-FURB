import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
        
    int valor;

    Scanner tec = new Scanner (System.in);

    System.out.println("Informe o valor: ");
    valor = tec.nextInt();

    if (valor % 2 == 0) {System.out.println("O valor é par");}
    else System.out.println("O valor é ímpar");
    

    }

}
