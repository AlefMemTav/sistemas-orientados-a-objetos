
package capituloQuatro.exemplos.exemploDois;

public final class Hemoterapeuta extends Medico {
    private boolean acreditadoInternacionalmente;
    
    public boolean isAcreditado(){
        return acreditadoInternacionalmente;
    }

    public void setAcreditadoInternacionalmente(boolean acreditadoInternacionalmente) {
        this.acreditadoInternacionalmente = acreditadoInternacionalmente;
    }    
}
