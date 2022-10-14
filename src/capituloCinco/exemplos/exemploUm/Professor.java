
package capituloCinco.exemplos.exemploUm;

public class Professor extends Profissional{
    private int horasTrabalhadas;
    
    public Professor() {
//        System.out.println("Contrutor da classe Professor");
//        salarioBruto = 0;
        this(0);
    }

    public Professor(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    
    public Professor(String cpf, String nome, float salarioBruto) {
//        setCpf(cpf);
//        setNome(nome);
//        this.salarioBruto = salarioBruto;
        super(cpf, nome, salarioBruto);
    }
    
    @Override
    public float calcularSalarioLiquido(float desconto, float bonus){
        return getSalarioBruto()*desconto*horasTrabalhadas + bonus;
    }
    

    public float calcularSalarioLiquido(float desconto){
        return getSalarioBruto()*desconto*horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    @Override
    public String obterRegistroProfissional() {
        return getCpf();
    }
}
