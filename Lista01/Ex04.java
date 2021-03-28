import java.util.Scanner;
import java.text.DecimalFormat;

class Ex04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o raio da lata de óleo?(cm) ");
        Float raio = entrada.nextFloat();
        
        System.out.println("Qual o altura da lata de óleo?(cm) ");
        Float altura = entrada.nextFloat();

        entrada.close();

        Float volume = 3.1f * (raio * raio) * altura;

        DecimalFormat formatador = new DecimalFormat("0.0");

        System.out.println("O volume da lata de óleo é "+ formatador.format(volume) +" cm³");

    }
}