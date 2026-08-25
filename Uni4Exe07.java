import java.util.Scanner;

public class Uni4Exe07 {

    public static void main(String[] args) {
        
    //Inserir o teclado 
    Scanner tec = new Scanner(System.in);

    //Inserir as variaves 
    System.out.println("Digite o peso da carta: ");
    int peso = tec.nextInt();
    double aPagar;

    //testar o peso da carta
    if (peso <= 50) {
        aPagar = 0.45;
    } else {
        //verificando quantas vezes a carta excedeu o peso de 50g
        aPagar = 0.45 + (peso - 50)/20*0.45;
        //verificaar se a divisão tem resto de excedente
        if ((peso-50)%20>0) {
            aPagar = aPagar + 0.45;
        }
    } 

    //escrever a resposta
    System.out.printf("Valor a pagar = %5.2f\n", aPagar);
    // %f é para escrever números com casas decimais
    // 5 representa o número total de casas
    // 2 representa a quantidade de casas depois da vírgula
    // \n é para pular de linha
    }
}
