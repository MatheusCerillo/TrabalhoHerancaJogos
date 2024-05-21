package Arsenal;

public class Magia extends Atk{

    private int magia;

    public void habilidade(int magia){
        this.magia = getDanoPadrao() * getDanoBonus() * getRaridade();
    }

    public void conjurar(int magia){
        this.magia = magia;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }
}
