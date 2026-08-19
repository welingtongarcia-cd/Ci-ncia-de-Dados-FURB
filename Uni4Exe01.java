import java.util.Scanner;

public class Uni4Exe01 {

    public static void main(String[] args) {
        
        //A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o valor por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
        //Horas trabalhadas no mês: 180
        //Valor pago por hora: 35
        //Resposta: O salário total é: 6650,00

        //variaveis
        float horastrabalhadas, valorhora, horaextra, salario;

        //denifir a leitura pelo teclado
        Scanner tec = new Scanner(System.in); 

        //ler as variaveis 
        System.out.println("Informe as horas trabalhadas");
        horastrabalhadas = tec.nextFloat();
        System.out.println("Informe o Valor da hora");
        valorhora = tec.nextFloat();

        //iniciar a hora extra
        horaextra = 0;

        //condição de hora extra
        if (horastrabalhadas > 160) {
            horaextra = horastrabalhadas - 160;
        }

        //calcular o salário
        salario = (horastrabalhadas - horaextra) * valorhora + horaextra * valorhora * 1.5f;

        //escrever o salário
        System.out.printf("Sario = R$ %8.2f", salario); 
    }
}