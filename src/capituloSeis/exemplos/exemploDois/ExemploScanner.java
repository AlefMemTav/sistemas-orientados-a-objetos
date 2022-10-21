
package capituloSeis.exemplos.exemploDois;

import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        Integer inteiro = input.nextInt();
        Float flutuante = input.nextFloat();
        Double decimal = input.nextDouble();
        Boolean logico = input.nextBoolean();
    }
}
