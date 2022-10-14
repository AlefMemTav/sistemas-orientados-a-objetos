
package capituloCinco.exemplos.exemploUm;

public class Engenheiro extends Profissional{
    private String crea;
//    public final float PISO_SALARIAL = 7000;
//    public static float PISO_SALARIAL = 7000;
    public final static float PISO_SALARIAL = 7000;
    
    public static float calcularPisoSalarialCorrigido(float fatorTrabalhista){
        return PISO_SALARIAL*fatorTrabalhista;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    @Override
    public String obterRegistroProfissional() {
        return crea;
    }
}
