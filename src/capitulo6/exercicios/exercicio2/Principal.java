package capitulo6.exercicios.exercicio2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = teclado.nextLine();

        String palavraLowerCase = palavra.toLowerCase();

        String invertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        }

        String invertidaLowerCase = invertida.toLowerCase();

        System.out.println("Palavra invertida: " + invertida);
        if (invertidaLowerCase.equals(palavraLowerCase)) {
            System.out.println("Palindromo!");
        } else {
            System.out.println("Não é palindromo!");
        }
    }
}
