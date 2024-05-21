package Boneco;

import Arsenal.Item;

public class Personagem extends Boneco {

    private Integer defesa;
    private Integer pulo;
    private Integer pegar;
    private Item item;
    private Integer iventario;

    public void defender(int atk){
        this.defesa = (Integer) (defesa - atk);
    }

    public void pulor(int pulo){
        this.pulo = getVelocidade();
    }

    public void pegarItem(int item){
        this.pegar = (Integer) (pegar + item);
    }

    public void iventario(int iventario, int item){
        this.iventario = (Integer) (iventario + item);
    }

    public Integer getDefesa() {
        return defesa;
    }

    public void setDefesa(Integer defesa) {
        this.defesa = defesa;
    }

    public Integer getPulo() {
        return pulo;
    }

    public void setPulo(Integer pulo) {
        this.pulo = pulo;
    }

    public Integer getPegar() {
        return pegar;
    }

    public void setPegar(Integer pegar) {
        this.pegar = pegar;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getIventario() {
        return iventario;
    }

    public void setIventario(Integer iventario) {
        this.iventario = iventario;
    }
}
