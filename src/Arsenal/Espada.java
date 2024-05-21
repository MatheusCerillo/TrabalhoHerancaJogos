package Arsenal;

public class Espada extends Atk{

    private int dano;


    public void danoEspadas (){
        this.dano = getDanoPadrao() * getDanoBonus() * getRaridade();
    }

    public void bater(){
        danoEspadas();
    }


}
