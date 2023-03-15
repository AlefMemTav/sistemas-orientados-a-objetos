
package capitulo6.exemplos.exemplo8;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Militar m = new Militar();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o nome do militar:");
        m.setNome(input.nextLine());
        boolean validaEnum = false;
        
        while(!validaEnum){
            try {
                System.out.println("Digite a Forca Armada do militar:");
//              m.setForca(input.nextLine());
        
//              String forca = input.nextLine();
                m.setForca(ForcaArmadaEnum.valueOf(input.nextLine()));
                validaEnum = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Digite MB, EB ou FAB para a Forca Armada.");
            }
        }
        System.out.println("Dados do militar:");
        System.out.println(m.getNome());
        System.out.println(m.getForca());
    }
}
