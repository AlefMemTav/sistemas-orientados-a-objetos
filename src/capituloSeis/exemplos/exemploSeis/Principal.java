
package capituloSeis.exemplos.exemploSeis;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Robo r1 = new Robo();
        
        try {
            System.out.println("Digite a distancia percorrida: ");
            int dist = input.nextInt();
            System.out.println("Digite o tempo levado para percorrer a distancia: ");
            int tempo = input.nextInt();
            r1.calcularVelocidade(tempo, dist);
        } catch (ArithmeticException e) {
            System.out.println("O tempo digitado é zero.");
        } finally {
            System.out.println("Velocidade do robo: " + r1.getVelocidade()); 
        }
    }
}
