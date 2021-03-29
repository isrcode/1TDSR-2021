import java.util.Scanner;

class Ex06 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        Integer horas, minutos, segundos;

        System.out.println("Hora: ");
        horas = entrada.nextInt();

        System.out.println("Minuto: ");
        minutos = entrada.nextInt();

        System.out.println("Segundos: ");
        segundos = entrada.nextInt();

        entrada.close();

        int segundosPos = (horas * 3600) + (minutos * 60) + segundos;
        int segundosAntes = 86400 - segundosPos;

        System.out.println("Já se passaram " + segundosPos + "s desde as 0h00min0s e faltam " + segundosAntes + "s para a meia noite.");
    }
}
