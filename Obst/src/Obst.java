public abstract class Obst {
    private String name;
    private String farbe;
    private double gewicht;
    private boolean reif;

    //Getter
    public String getName(){
        return name;
    }
    //Setter
    public void setName(String name){
        this.name = name;
    }
    public String getFarbe(){
        return farbe;
    }
    public void setFarbe(String farbe){
        this.farbe = farbe;
    }
    public double getGewicht(){
        return gewicht;
    }
    public void setGewicht(double gewicht){
        this.gewicht = gewicht;
    }
    public boolean isReif(){
        return reif;
    }
    public void setReif(boolean reif){
        this.reif = reif;
    }
    //Konstruktor
    public Obst (String name){
        this.name = name;
    }

    @Override
    public String toString(){
        String text = "Name = " + name;
        text += "\n\t farbe = " + farbe;
        text += "\n\t gewicht = " + gewicht;
        text += "\n\t reif = " + reif;

        return text;
    }

}
