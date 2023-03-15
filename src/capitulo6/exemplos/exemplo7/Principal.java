
package capitulo6.exemplos.exemplo7;

public class Principal {
    public static void main(String[] args) {
        Jogador j = new Jogador();
        
//        try{
//            j.setIdade(7);
//        }catch(Exception e){
//            System.out.println(e);
//        }
        try{
            j.setIdade(7);
        }catch(IdadeJogadorException e){
            System.out.println(e);
        }
    }
}
