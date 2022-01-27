public class Banane extends Obst{

    private double kreummung;

        public Banane(){
            super("Banane");
        }
         public double getKreummung(){
            return kreummung;
         }
         public void setKreummung(double kreummung){
            this.kreummung = kreummung;
         }

         @Override
    public String toString (){
            String text = super.toString();
            text += "\n\t Kreummmung =" + kreummung;

            return text;
         }

}


