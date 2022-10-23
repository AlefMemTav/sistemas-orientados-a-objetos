
package capituloSeis.exemplos.exemploOito;

public enum ForcaArmadaEnum {
    MB("Marinha do Brasil"), EB("Exercito Brasileiro"), FAB("Força Aerea Brasileira");
    
    private final String descricao;

    private ForcaArmadaEnum(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
