
package capituloSeis.exemplos.exemploTres;

public class PessoaFisica extends Cliente{
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String toString() {
//        return "\nnome:" + getNome() + "\ncpf: " + cpf;
        return super.toString() + "\ncpf: " + cpf;
    }
}