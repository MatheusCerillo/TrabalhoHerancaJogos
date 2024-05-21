package Arsenal;

public class Atk extends Raridade {

    private Double atkS;
    private Integer padrao;
    private Double distacia;

    public void atkSpeed() {
        this.atkS = atkS;
    }

    public void PadraoAtk() {
        this.padrao = padrao;
    }

    public void alcance() {
        this.distacia = distacia;
    }

    public Double getAtkS() {
        return atkS;
    }

    public void setAtkS(Double atkS) {
        this.atkS = atkS;
    }

    public Integer getPadrao() {
        return padrao;
    }

    public void setPadrao(Integer padrao) {
        this.padrao = padrao;
    }

    public Double getDistacia() {
        return distacia;
    }

    public void setDistacia(Double distacia) {
        this.distacia = distacia;
    }
}
