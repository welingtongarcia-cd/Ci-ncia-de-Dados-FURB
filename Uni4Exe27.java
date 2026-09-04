import java.util.Scanner;

public class Uni4Exe27 {

    public static void main(String[] args) {

        // inserir teclado
        Scanner tec = new Scanner(System.in);

        // inserir as variáveis
        // ler os horários
        System.out.println("Insira a Hora de Entrada:");
        int horaInicio = tec.nextInt();
        System.out.println("Insira os Minutos de Entrada:");
        int minutosInicio = tec.nextInt();
        System.out.println("Insira a Hora de Saída:");
        int horaFim = tec.nextInt();
        System.out.println("Insira os Minutos de Saída:");
        int minutosFim = tec.nextInt();
        double aCobrar = 0;

        // converter para o tempo total em minutos
        int minutosTotalInicio = horaInicio * 60 + minutosInicio;
        int minutosTotalFim = horaFim * 60 + minutosFim;

        // testar se o horário é valido
        if (minutosInicio >= 0 && minutosInicio <= 59 &&
                minutosFim >= 0 && minutosFim <= 59 &&
                horaInicio >= 0 && horaInicio <= 23 &&
                horaFim >= 0 && horaFim <= 23 &&
                minutosTotalFim > minutosTotalInicio) {

            // calcular o valor a cobrar
            int tempoMinutos = minutosTotalFim - minutosTotalInicio;
            if (tempoMinutos <= 89) {
                aCobrar = 5;
            } else {
                if (tempoMinutos >= 90 && tempoMinutos <= 149) {
                    aCobrar = 10;
                } else {
                    if (tempoMinutos >= 150 && tempoMinutos <= 209) {
                        aCobrar = 17.5;
                    } else {
                        if (tempoMinutos >= 210 && tempoMinutos <= 269) {
                            aCobrar = 25;
                        } else {
                            aCobrar = 25 + (tempoMinutos / 60 - 4) * 10;
                            if (tempoMinutos % 60 >= 30) {
                                aCobrar = aCobrar + 10;
                            }
                        }
                    }
                }
            }
            System.out.println("A cobrar:" + aCobrar);
            System.out.printf("Tempo total: %d:%d\n", tempoMinutos / 60, tempoMinutos % 60);
        } else {
            System.out.println("Dados Incorretos");
        }
    }
}