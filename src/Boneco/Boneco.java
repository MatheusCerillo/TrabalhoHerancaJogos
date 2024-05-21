package Boneco;

public class Boneco {

    private Integer vida;
    private String skin;
    private Integer velocidade;
    private Integer atk;

    public void andar () {
        this.velocidade = (Integer) (velocidade + 1);
    }

    public void parar () {
        this.velocidade = (Integer) 0;
    }

    public void atacar () {
        this.atk = atk;
    }

    public void danoRecebido () {
        this.vida = (Integer) (vida - atk);
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }
}
