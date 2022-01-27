package schritt1;

import schritt3.Person;

public class Trainer extends Person {
    private int erfahrung;

    public Trainer (String name, int alter, int erfahrung){
        super(name, alter);
        this.erfahrung = erfahrung;
    }
    //Getter
    public int getErfahrung(){
        return erfahrung;
    }
    //setter
    public void setErfahrung(int erfahrung){
        this.erfahrung = erfahrung;
    }

    @Override
    public String toString(){
        String text = super.toString();
        text += "\n\t" + "Erfahrung:" + erfahrung;
        return text;
    }







}
