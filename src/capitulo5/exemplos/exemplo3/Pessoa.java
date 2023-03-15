
package capitulo5.exemplos.exemplo3;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String telefone;
    private String endereco;
//    private Carro carro;
    private List<Carro> listaDeCarros;

    public Pessoa() {
        this.listaDeCarros = new ArrayList();
    }

    public void adicionarCarro(Carro carro){
        listaDeCarros.add(carro);
    }
    
    public void removerCarro(Carro carro){
        listaDeCarros.remove(carro);
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
//    public Carro getCarro() {
//        return carro;
//    }
//
//    public void setCarro(Carro carro) {
//        this.carro = carro;
//    }

    public List<Carro> getListaDeCarros() {
        return listaDeCarros;
    }

    public void setListaDeCarros(List<Carro> listaDeCarros) {
        this.listaDeCarros = listaDeCarros;
    }
    
    
    
}
