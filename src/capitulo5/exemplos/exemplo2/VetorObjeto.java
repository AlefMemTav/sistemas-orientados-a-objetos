
package capitulo5.exemplos.exemplo2;

import capitulo5.exemplos.exemplo1.Engenheiro;

public class VetorObjeto {
    public static void main(String[] args) {
        Engenheiro[] engenheiros = new Engenheiro[10];
        
        for (int i = 0; i < engenheiros.length; i++) {
            Engenheiro engenheiro = engenheiros[i];
        }
        
        for (Engenheiro engenheiro : engenheiros) {
            System.out.println("Digite o nome do engenheiro: ");
            String input = new java.util.Scanner(System.in).next();
            
            engenheiro.setNome(input);
        }
    }
}
