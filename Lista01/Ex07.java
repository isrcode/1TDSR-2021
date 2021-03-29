import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex07 {
    
    public static void main(String[] args) {
        DecimalFormat formatador = new DecimalFormat("0.00");
        
        Scanner entrada  = new Scanner(System.in);
        float raio, perimentro, area;

        System.out.println("Digite o raio de um circulo (m): ");
        raio = entrada.nextFloat();

        entrada.close();

        perimentro = 2 * 3.14159f * raio;
        area = 3.14159f * (raio * raio);

        System.out.println("Um circulo com "+formatador.format(raio)+"m de raio, tem um perímentro de "+formatador.format(perimentro)+"m e umas área de "+formatador.format(area)+"m²");
    }
}
