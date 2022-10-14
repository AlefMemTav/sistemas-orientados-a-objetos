
package capituloCinco.exemplos.exemploUm;

import java.util.Date;

public class Imovel implements Balancete{
    private String descricao;
    private Date dataInicioDeContrato;
    private float valorDoAluguel;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataInicioDeContrato() {
        return dataInicioDeContrato;
    }

    public void setDataInicioDeContrato(Date dataInicioDeContrato) {
        this.dataInicioDeContrato = dataInicioDeContrato;
    }

    public float getValorDoAluguel() {
        return valorDoAluguel;
    }

    public void setValorDoAluguel(float valorDoAluguel) {
        this.valorDoAluguel = valorDoAluguel;
    }

    @Override
    public float declararDespesa() {
        return valorDoAluguel;
    }
}
