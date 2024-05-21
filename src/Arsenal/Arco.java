package Arsenal;

public class Arco extends Atk {

    private int municao;
    private int dano;


    public void danoArco (){
        this.dano = getDanoPadrao() * getDanoBonus() * getRaridade();
    }

    public void progetil() {
        this.municao = municao - 1;
    }

    public int getMunicao() {
        return municao;
    }

    public void setMunicao(int municao) {
        this.municao = municao;
    }

    public void bater(){
        danoArco();
    }
}
