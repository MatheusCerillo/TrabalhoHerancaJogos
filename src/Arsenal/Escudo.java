package Arsenal;

public class Escudo extends Raridade{

    private Integer padrao;
    private int defesa;

    public void PadraoDef (){
        this.padrao = padrao;
    }

    public void defesa(int defesa){
        this.defesa = defesa;
    }

    public void defender(){
        this.defesa = defesa + defesa;
    }

}
