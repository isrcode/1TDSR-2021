import java.util.Scanner;
import java.text.DecimalFormat;

class Ex01 {

    public static void main(String[] args) {

        Scanner entrada  = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        float celsius = entrada.nextFloat();

        entrada.close();

        DecimalFormat formatador = new DecimalFormat("0.000");

        float kelvin = celsius + 273.15f;

        float reaumur = celsius * 0.8f;

        float rankine = celsius * 1.8f + 32 + 459.67f;

        float fahrenheit = celsius * 1.8f + 32;

        System.out.println(celsius+"°C" + " em Fahrenheit é " + formatador.format(fahrenheit) + "°F");
        System.out.println(celsius+"°C" + " em Kelvin é " + formatador.format(kelvin) + "K");
        System.out.println(celsius+"°C" + " em Réaumur é " + formatador.format(reaumur) + "°Ré");
        System.out.println(celsius+"°C" + " em Rankine é " + formatador.format(rankine) + "Ra");
    }
}