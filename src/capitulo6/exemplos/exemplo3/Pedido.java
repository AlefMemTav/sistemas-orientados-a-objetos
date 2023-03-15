
package capitulo6.exemplos.exemplo3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pedido {
    private int numero;
    private List<Item> listaItens;
    private Cliente cliente;
    
    public Pedido() {
        listaItens = new ArrayList();
    }
    
    public void adicionarItem(Item item){
        listaItens.add(item);
    }
    
    public void removerItem(Item item){
        listaItens.remove(item);
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<Item> listaItens) {
        this.listaItens = listaItens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        String text = "\nnumero: " + numero;
        text = text + cliente;
        Iterator<Item> iterator = listaItens.iterator();
        
        while(iterator.hasNext()){
            text = text + iterator.next();
        }
        return text;
    }
}
