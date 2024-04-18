public enum Håndtegn {
    STEN ("Sten", 1),
    SAKS ("Saks", 2),
    PAPIR ("Papir", 3);


    //Attributter
    private String displayHåndtegn;
    private int håndtegnsVærdi;


Håndtegn(String displayHåndtegn, int håndtegnsVærdi){
this.displayHåndtegn = displayHåndtegn;
this.håndtegnsVærdi = håndtegnsVærdi;
}

    public String getDisplayHåndtegn() {
        return displayHåndtegn;
    }

    public void setDisplayHåndtegn(String displayHåndtegn) {
        this.displayHåndtegn = displayHåndtegn;
    }

    public int getHåndtegnsVærdi() {
        return håndtegnsVærdi;
    }

    public void setHåndtegnsVærdi(int håndtegnsVærdi) {
        this.håndtegnsVærdi = håndtegnsVærdi;
    }

    @Override
    public String toString() {
        return håndtegnsVærdi + ". " + displayHåndtegn;
    }
}
