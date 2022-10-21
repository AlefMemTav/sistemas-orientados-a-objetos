
package capituloSeis.exemplos.exemploDois;

import java.util.Scanner;

public class ExemploDoisScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        
        if(input.hasNextInt()){
            Integer inteiro = input.nextInt();
        }
        if(input.hasNextFloat()){
            Float flutuante = input.nextFloat();      
        }
        if(input.hasNextDouble()){
            Double decimal = input.nextDouble();           
        }
        if(input.hasNextBoolean()){
            Boolean logico = input.nextBoolean();        
        }
    }
}
