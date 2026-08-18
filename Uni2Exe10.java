import java.util.Scanner;

public class Uni2Exe10 {

    public static void main(String[] args) {
        
        //Exercício 10: Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

        //declarar as variáveis
        int duracao, horas, minutos, segundos;

        //definir o teclado
        Scanner tec = new Scanner(System.in);

        //ler a duração
        System.out.println("Digite a duração (em segundos)");
        duracao = tec.nextInt();

        //calcular a duração em horas, minutos e segundos
        horas = duracao / 3600;
        minutos = duracao % 3600 / 60;
        segundos = duracao % 3600 % 60;

        //escrever o resultado
        System.out.println("Valor em horas , minuots e sgundos");
        System.out.println(horas + ":" + minutos + "'" + segundos);
    }

}
