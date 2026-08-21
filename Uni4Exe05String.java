import java.util.Scanner;

public class Uni4Exe05String {

      public static void main(String[] args) {
        
    //Inserir teclado
    Scanner tec = new Scanner(System.in);

    //Inserir a pergunta
    System.out.println("A cor é Azul? (Sim/Não)");
    String resposta = tec.next();

    //Testar a resposta
    //equalsIgnoreCase função para ler a String 
    if (resposta.equalsIgnoreCase("Sim")) { 
        System.out.println("Sim");
    } else {
        System.out.println("Não");
    }
    }
}