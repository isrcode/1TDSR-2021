import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex08 {

    public static void main(String[] angs) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat ftd = new DecimalFormat("0.00");
        
        float valorFabrica, percetDistribuidor, imposto, vlConsumidor;

        System.out.println("Digite o valor de fabrica do carro: ");
        valorFabrica = entrada.nextFloat();

        entrada.close();

        percetDistribuidor = valorFabrica * 0.28f;
        imposto = valorFabrica * 0.45f;
        vlConsumidor = valorFabrica + percetDistribuidor + imposto;

        System.out.println("Um carro com preço de fabrica de R$"+ftd.format(valorFabrica)+" com o acrecimo de 28% (R$"+ftd.format(percetDistribuidor)+") do distribuidor e mais 45% (R$"+ftd.format(imposto)+") de impostos, sai para o consumidor final por R$"+ ftd.format(vlConsumidor));
    }
}
