
package capituloCinco.exemplos.exemploQuatro;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private String titulo;
    private List<Turma> listaTurmas;
    
    public Professor(){
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Turma> getListaTurmas() {
        return listaTurmas;
    }

    public void setListaTurmas(List<Turma> listaTurmas) {
        this.listaTurmas = listaTurmas;
    }
}
