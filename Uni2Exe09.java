import java.util.Scanner;

public class Uni2Exe09 {

public static void main(String[] args) {
    //declaração de variáveis
    float dolares, cotacao, reais;

    //definir o teclado
    Scanner tec = new Scanner(System.in);

    //ler dolares
    System.out.println("Informe o valor em dólares");
    dolares = tec.nextFloat();

    //ler cotacao
    System.out.println("Informe a cotação do dólar");
    cotacao = tec.nextFloat();

    //conversão de dolares para reais
    reais = dolares * cotacao;

    //escrever o resultado
    System.out.println("Valor em reais = " + reais);


}
}
