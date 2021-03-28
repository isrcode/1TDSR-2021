import java.util.Scanner;
import java.text.DecimalFormat;

class Ex03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a altura da parede(m): ");
        Float hp = entrada.nextFloat();

        System.out.println("Digite a largura da parede(m): ");
        Float lp = entrada.nextFloat();

        System.out.println("Digite a altura do azuleijo(cm): ");
        Float ha = entrada.nextFloat();

        System.out.println("Digite a largura do azuleijo(cm): ");
        Float la = entrada.nextFloat();

        entrada.close();

        DecimalFormat format1 = new DecimalFormat("0.00");
        DecimalFormat format2 = new DecimalFormat("0");

        Float quantAzulejos = ((hp*100)/lp) * ((lp*100)/la);

        System.out.println("Seram nescessario "+format2.format(quantAzulejos)+" azulejos para cobrir uma parede de "+ format1.format(hp*lp)+"m²");
    }
}
