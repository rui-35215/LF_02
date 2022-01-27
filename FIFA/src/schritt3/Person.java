package schritt3;

public abstract class Person {
    private String name;
    private int alter;

    public Person(String name, int alter){
        this.name = name;
        this.alter = alter;
    }

    //getter
    public String getName(){
        return getName();
    }
    public String getAlter(){
        return getAlter();
    }
    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setAlter(int alter){
        this.alter = alter;
    }
    @Override
    public String toString(){
        String Person = "";
        Person += "\nName:" + name;
        Person += "\nAlter:" + alter;
        return Person;
    }



}
