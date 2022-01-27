package Schritt2;

import schritt1.Spieler;

public class Torwart extends Spieler {
    private int reaktion;

    //Getter
    public int getReaktion(){
        return getReaktion();
    }
    //setter
    public void setReaktion(int reaktion){
        this.reaktion = reaktion;
    }

    public Torwart(String name, int alter,  int stärke, int motivation,int reaktion) {
        super(name, alter, 0, stärke, 0, motivation);
        this.reaktion = reaktion;
    }
    @Override
    public String toString(){
        String torwart = super.toString();
        torwart += "\n\tReaktion:" + reaktion;
        return torwart;
    }


}
