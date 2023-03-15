
package capitulo4.exemplos.exemplo2;

public abstract class Profissional {
    private String cpf;
    private String nome;
    protected float salarioBruto;

    public Profissional() {
        salarioBruto = 0;
    }
    
    public Profissional(String cpf, String nome, float salarioBruto) {
        this.cpf = cpf;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }
    
    public abstract String obterRegistroProfissional();
    
    public float calcularSalarioLiquido(float desconto, float bonus){
        return salarioBruto*desconto + bonus;
    }

    public final void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBruto(float salarioBruto) {
        if(salarioBruto >= 0){
            this.salarioBruto = salarioBruto;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }
}
