import java.util.Scanner;

public class Uni4Exe05Char {

      public static void main(String[] args) {
        
    //Inserir teclado
    Scanner tec = new Scanner(System.in);

    //Inserir a pergunta
    System.out.println("A cor é Azul? (S/N)");
    char resposta = tec.next().charAt(0); //ler um caracter

    //Testar a resposta
    if (resposta == 'S') { //só funciona para o S maiúsculo
        System.out.println("Sim");
    } else {
        System.out.println("Não");
    }
    }
}