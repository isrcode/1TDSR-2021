import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex02 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.println("Salario do 1° Funcionario: ");
        Float salFunc1 = entrada.nextFloat();

        System.out.println("Salario do 2° Funcionario: ");
        Float salFunc2 = entrada.nextFloat();

        System.out.println("Salario do 3° Funcionario: ");
        Float salFunc3 = entrada.nextFloat();

        System.out.println("Salario do 4º Funcionario: ");
        Float salFunc4 = entrada.nextFloat();

        entrada.close();

        DecimalFormat formatador = new DecimalFormat("0.00");

        Float mediaSal = (salFunc1 + salFunc2 + salFunc3 + salFunc4) / 4;

        System.out.println("A média salarial da empresa é de R$"+ formatador.format(mediaSal));
    }
}