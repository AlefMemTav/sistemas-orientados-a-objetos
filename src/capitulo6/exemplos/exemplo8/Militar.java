
package capitulo6.exemplos.exemplo8;

public class Militar {
    private String nome;
//    private String forca; 
    private ForcaArmadaEnum forca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//    public String getForca() {
//        return forca;
//    }
//
//    public void setForca(String forca) {
//        this.forca = forca;
//    }

    public ForcaArmadaEnum getForca() {
        return forca;
    }

    public void setForca(ForcaArmadaEnum forca) {
        this.forca = forca;
    }
    
}
