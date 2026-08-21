import java.util.Scanner;

public class Uni4Exe05 {

    public static void main(String[] args) {
        
    //Inserir teclado
    Scanner tec = new Scanner(System.in);

    //Inserir a pergunta
    System.out.println("A cor é Azul? (responda true ou false)");
    boolean resposta = tec.nextBoolean();

    //Testar a resposta
    if (resposta == true) {
        System.out.println("Sim");
    } else {
        System.out.println("Não");
    }
    }
}
