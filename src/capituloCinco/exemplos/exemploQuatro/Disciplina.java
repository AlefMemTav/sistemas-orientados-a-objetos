
package capituloCinco.exemplos.exemploQuatro;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private int quantidadeDeCreditos;
    private List<Turma> listaTurmas;

    public Disciplina() {
        listaTurmas = new ArrayList();
    }
    
    public void adicionarTurma(Turma turma){
        listaTurmas.add(turma);
    }
    
    public void removerTurma(Turma turma){
        listaTurmas.remove(turma);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDeCreditos() {
        return quantidadeDeCreditos;
    }

    public void setQuantidadeDeCreditos(int quantidadeDeCreditos) {
        this.quantidadeDeCreditos = quantidadeDeCreditos;
    }

    public List<Turma> getListaTurmas() {
        return listaTurmas;
    }

    public void setListaTurmas(List<Turma> listaTurmas) {
        this.listaTurmas = listaTurmas;
    }
}
