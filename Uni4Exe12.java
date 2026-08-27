import java.util.Scanner;

public class Uni4Exe12 {

    public static void main(String[] args) {

        // Dados 3 valores lado1, lado2, lado3, que representam os comprimentos dos
        // lados de um triângulo, descreva um algoritmo que verifique se os mesmos podem
        // ser os comprimentos dos lados de um triângulo. Em caso afirmativo, verifique
        // e informe se é "triângulo equilátero", "triângulo isósceles" ou "triângulo
        // escaleno". Em caso negativo, informe que os mesmos não formam um triângulo.
        // Considere o que:

        // o comprimento de cada lado de um triângulo é menor que a soma dos
        // comprimentos dos outros lados
        // um triângulo equilátero tem três lados iguais
        // um triângulo isóscele tem dois lados iguais e um diferente
        // um triângulo escaleno tem três lados diferentes

        //Inserir o teclado
        Scanner tec = new Scanner(System.in);

        //leitura dos dados
        System.out.println("Informe o lado 1 do Triângulo: ");
        int lado1 = tec.nextInt();
        System.out.println("Informe o lado 2 do Triângulo: ");
        int lado2 = tec.nextInt();
        System.out.println("Informe o lado 3 do Triângulo: ");
        int lado3 = tec.nextInt();

        //testar se os lados formam um triângulo
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            //testar se é Equilátero
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("TRIÂNGULO EQUILÁTERO");
            } else {
                //testar se é Isósceles
                if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    System.out.println("TRIÂNGULO ISÓSCELES");
                } //caso não seja Equilátero, só resta ser escaleno
                else {
                    System.out.println("TRIÂNGULO ESCALENO");
                }
            }
            } System.out.println("NÃO É UM TRIÂNGULO");
        }
    }