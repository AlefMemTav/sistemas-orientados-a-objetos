
package capituloSeis.exemplos.exemploTres;

public class PessoaJuridica {
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    @Override
    public String toString() {
        return super.toString() + "cnpj: " + cnpj;
    }   
}
