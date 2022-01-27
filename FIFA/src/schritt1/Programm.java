package schritt1;

import Schritt2.Torwart;

import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {
        Trainer ernst = new Trainer("Ernst", 68,30);
        System.out.println(ernst);

        Spieler salah = new Spieler("Mohammed salah", 28, 10,8, 10,10);
        System.out.println(salah);

        Torwart chan = new Torwart("Chan",21,10,10,8);
        System.out.println(chan);
        System.out.printf("mannschaft");
        Spieler spieler1 =  new Spieler("salah", 28,3,9,9,10 );
        Spieler spieler2 = new Spieler("Chan",21,3,6,5,7);
        Spieler spieler3= new Spieler("Seval",18,1,6,4,10);
        Spieler spieler4 = new Spieler("Thomas",33,10,5,6,7);
        Spieler spieler5 = new Spieler("Coman,",25,15,6,7,7);
        Spieler spieler6 = new Spieler("Messi,",33,30,6,9,4);
        Spieler spieler7 = new Spieler("Ronaldo",33,34,8,10,10);
        Spieler spieler8 = new Spieler("Mane",28,20,7,9,9 );
        Spieler spieler9 = new Spieler("Neymar",28,23,7,9,7);


        ArrayList<Spieler> spielerHeim = new ArrayList<>();
        spielerHeim.add(spieler1);
        spielerHeim.add(spieler2);
        spielerHeim.add(spieler3);
        spielerHeim.add(spieler4);
        spielerHeim.add(spieler5);
        spielerHeim.add(spieler6);
        spielerHeim.add(spieler7);
        spielerHeim.add(spieler8);
        spielerHeim.add(spieler9);

        Trainer trainer = new Trainer("Andreas",55,10);

        Torwart torwart = new Torwart("Buffon",38,8,10,9);

        System.out.println(spieler1);
        System.out.println(spieler2);
        System.out.println(spieler3);
        System.out.println(trainer);
        System.out.println(torwart);





    }


}
