
package capituloCinco.exemplos.exemploSeis;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private String cpf;
    private String nome;
    private Funcionario supervisor;
    private List<Funcionario> listaSupervisionados;
    
    public Funcionario(){
        listaSupervisionados = new ArrayList();
    }
    
    public void adicionarSupervisionado(Funcionario funcionario){
        listaSupervisionados.add(funcionario);
    }
    
    public void removerSupervisionado(Funcionario funcionario){
        listaSupervisionados.remove(funcionario);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Funcionario supervisor) {
        this.supervisor = supervisor;
    }

    public List<Funcionario> getListaSupervisionados() {
        return listaSupervisionados;
    }

    public void setListaSupervisionados(List<Funcionario> listaSupervisionados) {
        this.listaSupervisionados = listaSupervisionados;
    } 
}
