public class StenSaksPapirSpil {
    Spiller spiller1;
    Spiller spiller2;


    public StenSaksPapirSpil(MenneskeSpiller spiller1, ComputerSpiller spiller2) {
        this.spiller1 = spiller1;
        this.spiller2 = spiller2;

    }

    public void startSpil() {
        String navnSpiller1 = spiller1.getSpillerNavn();
        String navnSpiller2 = spiller2.getSpillerNavn();
        Håndtegn[] håndtegnArray = Håndtegn.values();
        int spiller1Håndtegn = 0;
        int spiller2Håndtegn = 0;
        // int SENTINEL = 0;
        int spilleRunde = 0;
        //Spiller vinner;


        while (true) {
            spiller1Håndtegn = spiller1.vælgHåndtegn();
            spiller2Håndtegn = spiller2.vælgHåndtegn();

            //System.out.println("spiller1Håndtegn: " + spiller1Håndtegn); //test af træk
            //System.out.println("spiller2Håndtegn: " + spiller2Håndtegn); //test af træk


            if (spiller1Håndtegn == spiller2Håndtegn) { //ens håndtegn
                System.out.println("Ens håndtegn, det er en ommer!");
                System.out.println(" ");//ekstra linjeskift
            } else if ((spiller1Håndtegn == 1 && spiller2Håndtegn == 2) ||
                    (spiller1Håndtegn == 2 && spiller2Håndtegn == 3) ||
                    (spiller1Håndtegn == 3 && spiller2Håndtegn == 1)) {
                System.out.println("Runde " + (++spilleRunde) + ", " + navnSpiller1 + " trækker: " + håndtegnArray[spiller1Håndtegn-1] + " " + navnSpiller2 + "trækker: " + håndtegnArray[spiller2Håndtegn-1]);
                System.out.println(navnSpiller1 + " vinder!");
                spiller1.sammentællingPoint();
            } else {
                System.out.println("Runde " + (++spilleRunde) + ", " + navnSpiller1 + " trækker: " + håndtegnArray[spiller1Håndtegn-1] + " " + navnSpiller2 + "trækker: " + håndtegnArray[spiller2Håndtegn-1]);
                System.out.println(navnSpiller2 + " vinder!");
                spiller2.sammentællingPoint();

            }
            System.out.println(" ");//ekstra linjeskift
            System.out.println("Point: ");
            System.out.println(navnSpiller1 + ": " + spiller1.getSpillerPoint());
            System.out.println(navnSpiller2 + ": " + spiller2.getSpillerPoint());
            System.out.println(" "); //ekstra linjeskift

            if (spiller1.getSpillerPoint() == 2 ||spiller2.getSpillerPoint() == 2){
                if (spiller1.getSpillerPoint() == 2) {
                    System.out.println("Juhu vinderen er: " + navnSpiller1);
                } else {
                    System.out.println("Juhu vindenren er: " + navnSpiller2);
                }
                break;
            }

        }

    }
}
