
package capituloSeis.exemplos.exemploCinco;

public class ExemploObjetoNaoInstanciado {
    public static void main(String[] args) {
        Pessoa p = null;
        
        try {
            p.setNome("Joshua");   
        } catch (NullPointerException e) {
            p = new Pessoa();
        } finally {
            p.setNome("Joshua");
        }
    }
}