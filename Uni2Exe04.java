import java.util.Scanner;

public class Uni2Exe04 {
    public static void main(String[] args) {
        System.out.println("Meu primeiro programa em Java");


       //declarar as variáveis
       System.out.println("Digite a primeira nota");
       float A;
       System.out.println("Digite a segunda nota");
       float B;
       float média;

      //criar uma variável para o teclado
      Scanner tec = new Scanner (System.in);   

      //entrada dos dados
      A = tec.nextFloat();
      B = tec.nextFloat();

      //calcular a média
      média = (A * 3.5f + B * 7.5f) / 11;

      //escrever a média
      System.out.println("Média = " + média);
      


    }
}

