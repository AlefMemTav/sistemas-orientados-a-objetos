package capitulo6.exercicios.exercicio3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de ponto flutuante (Ex: 1,2): ");
        float numero = scanner.nextFloat();

        DecimalFormat formato = new DecimalFormat("#.##");
        String palavra = formato.format(numero);

        System.out.println("O número formatado é: " + palavra);
    }
}
