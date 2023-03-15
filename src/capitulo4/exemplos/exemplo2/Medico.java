
package capitulo4.exemplos.exemplo2;

public class Medico extends Profissional{
    private String crm;

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    @Override
    public String obterRegistroProfissional() {
        return crm;
    }
}
