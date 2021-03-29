import java.util.Scanner;

class Ex05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o peso da massa (kg): ");
        Float massa = entrada.nextFloat();

        System.out.println("Digite a altura (m): ");
        Float altura = entrada.nextFloat();

        System.out.println("Digite o tempo (s): ");
        Float tempo = entrada.nextFloat();

        entrada.close();

        Float cavalo = (massa * altura / tempo) / 745.6999f;

        System.out.println("A quantidade de cavalos nescessarios é: " + cavalo);
    }
}