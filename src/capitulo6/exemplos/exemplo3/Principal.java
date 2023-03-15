
package capitulo6.exemplos.exemplo3;

public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setCodigo(1);
        p1.setNome("Video-game");
        p1.setPreco(3000);
        
        Produto p2 = new Produto();
        p2.setCodigo(2);
        p2.setNome("Televisao");
        p2.setPreco(5500);
        
        Item i1 = new Item();
        i1.setProduto(p1);
        i1.setQuantidade(2);
        
        Item i2 = new Item();
        i2.setProduto(p2);
        i2.setQuantidade(3);
        
        PessoaFisica c1 = new PessoaFisica();
        c1.setNome("Joshua");
        c1.setCpf("111.111.111-11");
         
        Pedido pd1 = new Pedido();
        pd1.setCliente(c1);
        pd1.setNumero(1);
        pd1.adicionarItem(i1);
        pd1.adicionarItem(i2);
        
        System.out.println(pd1);
    }
}
