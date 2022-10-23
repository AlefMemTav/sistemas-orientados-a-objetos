
package capituloSeis.exemplos.exemploSete;

public class Jogador {
    private String nome;
    private String cpf;
    private int idade;    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

//    public void setIdade(int idade) throws Exception{
//        Exception e = new Exception("Jogador menor de 18 anos de idade.");
//        if(idade < 18){
//            throw e;
//        }
//        this.idade = idade;
//    }
    
    public void setIdade(int idade) throws IdadeJogadorException{
        if(idade < 18){
            throw new IdadeJogadorException("Jogador menor de 18 anos de idade.");
        }
        this.idade = idade;
    }
    
}
