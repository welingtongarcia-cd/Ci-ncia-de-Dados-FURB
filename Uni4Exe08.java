import java.util.Scanner;

public class Uni4Exe08 {

    public static void main(String[] args) {
        

    //Dado uma letra, escreva um algoritmo que informa se ela é ou não uma vogal.


    //inserir teclado
    Scanner tec = new Scanner(System.in);

    //Inserir variaveis
    System.out.println("Digite uma letra");
    char letra = tec.next().charAt(0);
    //converter a letra para minúscula
    letra = Character.toLowerCase(letra);

    //testar se a letra é volgar
    if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') { 
        System.out.println("É volgal");
    }    else {
        System.out.println("Não é volgal");
    }
    }
}