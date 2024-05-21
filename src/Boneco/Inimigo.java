package Boneco;

public class Inimigo extends Boneco{

    private Integer dano;
    private Integer padrao;

    public void danoInimigo (){
        this.dano = dano;
    }

    public void PadraoATKInimigo (){
        this.padrao = padrao;
    }

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public Integer getPadrao() {
        return padrao;
    }

    public void setPadrao(Integer padrao) {
        this.padrao = padrao;
    }
}
