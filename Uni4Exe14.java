import java.util.Scanner;

public class Uni4Exe14 {

    public static void main(String[] args) {
        
        //inserir teclado
        Scanner tec = new Scanner(System.in);

        //ler as variaveis
        System.out.println("Informe o dia:");
        int dia = tec.nextInt();
        System.out.println("Informe o mês:");
        int mes = tec.nextInt();
        System.out.println("Informe o ano:");
        int ano = tec.nextInt();

        int maximoDias = 31;

       
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
         maximoDias = 31;
        } else if (mes == 6 || mes == 4 || mes == 9 || mes == 11) {
            maximoDias = 30;
        } else if (mes == 2 && ano % 4 == 0) {
            maximoDias = 29;
        } else {
            maximoDias = 28;
        }
        if (mes > 0 && mes <= 12 && dia > 0 && dia <= maximoDias) {
            System.out.println("Data Válida");
        } else {
            System.out.println("Data Inválida");
        }

    }
}
