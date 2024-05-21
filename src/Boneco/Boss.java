package Boneco;

public class Boss extends Inimigo{

    private Integer magia;

    public void habilidade(){
        this.magia = magia;
    }

    public void status (){
        this.setVida(Integer.valueOf(super.getVida() * 10));
        this.setDano(Integer.valueOf(super.getDano() * 3));
    }

    public Integer getConjurar() {
        return magia;
    }

    public void setConjurar(Integer conjurar) {
        this.magia = conjurar;
    }
}
