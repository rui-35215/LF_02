package schritt4;

import Schritt2.Torwart;
import schritt1.Spieler;
import schritt1.Trainer;

import java.util.ArrayList;

public class Mannschaft {
    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spielerListe;
    private int motivation;
    private int motivationsmittelwert;
    private int staerke;
    private int mittelwertstaerke;

    public Mannschaft(String name, Trainer trainer, Torwart torwart, ArrayList<Spieler> spielerListe){
        this.name = name;
        this.trainer = trainer;
        this.torwart = torwart;
        this.spielerListe = spielerListe;

    }

    //Getter
    public String getName(){
        return name;
    }
    public Trainer getTrainer(){
        return trainer;
    }
    public Torwart getTorwart(){
        return torwart;
    }
    public ArrayList<Spieler>getSpielerListe(){
        return spielerListe;
    }


    //Setter
    public void setName(String name){
        this.name = name;
    }
    public void setTrainer(Trainer trainer){
        this.trainer = trainer;
    }
    public void setTorwart(Torwart torwart){
        this.torwart = torwart;
    }
    public void setSpielerListe(ArrayList<Spieler>spielerListe){
        this.spielerListe = spielerListe;
    }
    public int getMotivation(){
        for (Spieler i:
                spielerListe){
             motivation += i.getMotivation();

        }
        motivation += torwart.getMotivation();
        motivationsmittelwert = motivation / (spielerListe.size() + 1);
        return motivationsmittelwert;
    }
    public int getStaerke(){
        for (Spieler i:
                spielerListe) {
            staerke += i.getStärke();

        }
        staerke = torwart.getStärke();
        mittelwertstaerke = staerke / (spielerListe.size() + 1);
        return mittelwertstaerke;
    }



    @Override
    public String toString(){
        String text = "\n\tname\t" + name ;
        text += "\n\trainer\t" + trainer;
        text += "\n\ttorwart \t" + torwart;
        text += "\n\tspielerliste\t =" + spielerListe;
        text += "\n\tmotivation\t  =" + motivation;


        return text;

    }
}

