package Arsenal;

public class Raridade extends Item{

    private Integer raridade;
    private Integer habilidade;
    private Integer danoBonus;


    public Integer danoBonus() {
        return danoBonus = danoBonus * raridade;
    }

    public Integer getDanoBonus() {
        return danoBonus = danoBonus;
    }

    public void setDanoBonus(Integer danoBonus) {
        this.danoBonus = danoBonus;
    }

    public void habilidadePassiva(){
        this.habilidade = habilidade * raridade;
    }

    public Integer getRaridade() {
        return raridade;
    }

    public void setRaridade(Integer raridade) {
        this.raridade = raridade;
    }

    public Integer getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(Integer habilidade) {
        this.habilidade = habilidade;
    }
}
