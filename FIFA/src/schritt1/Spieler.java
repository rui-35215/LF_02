package schritt1;

public class Spieler {
    private String name;
    private int alter;
    private int tore;
    private int stärke;
    private int torschuss;
    private int motivation;

    public Spieler(String name, int alter,int tore, int stärke, int torschuss, int motivation ){
        this.name = name;
        this.alter = alter;
        this.tore = tore;
        this.stärke = stärke;
        this.torschuss = torschuss;
        this.motivation = motivation;
    }
    //getter
    public String getName(){
        return name;
    }
    public int getAlter(){
        return getAlter();
    }
    public int getTore(){
        return getTore();
    }
    public int getStärke(){
        return getStärke();
    }
    public int getTorschuss(){
        return getTorschuss();
    }
    public int getMotivation(){
        return getMotivation();
    }
    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setAlter(int alter){
        this.alter = alter;
    }
    public void setTore(int tore){
        this.tore = tore;
    }
    public void setStärke(int stärke){
        this.stärke = stärke;
    }
    public void setTorschuss(int torschuss){
        this.torschuss = torschuss;
    }
    public void setMotivation(int motivation){
        this.motivation = motivation;
    }

    @Override
    public String toString(){
        String text =   "\nName :" + name;
        text +=   "\n\tAlter:" + alter;
        text +=   "\n\tTore:" + tore;
        text +=   "\n\tStärke:" + stärke;
        text +=   "\n\tTorschuss:" + torschuss;
        text +=   "\n\tMotivation:" + motivation;

        return text;
    }




}
