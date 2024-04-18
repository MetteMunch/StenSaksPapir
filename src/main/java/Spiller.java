abstract class Spiller {

    private String spillerNavn;
    private int spillerPoint;

    //Constructor
    public Spiller(String spillerNavn) {
        this.spillerNavn = spillerNavn;
    }

    //abstract metode
    public abstract int vælgHåndtegn();


    //metode

    public void sammentællingPoint() {
        spillerPoint = spillerPoint+1;
    }





    //getter og setter


    public String getSpillerNavn() {
        return spillerNavn;
    }

    public int getSpillerPoint() {
        return spillerPoint;
    }

    public void setSpillerPoint(int spillerPoint) {
        this.spillerPoint = spillerPoint;
    }
}
