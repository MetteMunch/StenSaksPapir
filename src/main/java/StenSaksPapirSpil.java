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
        int SENTINEL = 0;
        int spilleRunde = 0;
        Spiller vinner;


        while (SENTINEL != 5) {
            System.out.println(spiller1Håndtegn = spiller1.vælgHåndtegn());
            spiller2Håndtegn = spiller2.vælgHåndtegn();

            if (spiller1Håndtegn == spiller2Håndtegn) { //ens håndtegn
                System.out.println("Ens håndtegn, det er en ommer!");
                System.out.println(" ");//ekstra linjeskift
            } else if (spiller1Håndtegn == 1 && spiller2Håndtegn == 2) { //sten mod saks
                spilleRunde++;
                spiller1.sammentællingPoint();
            } else if (spiller1Håndtegn == 2 && spiller2Håndtegn == 1) { //saks mod sten
                spilleRunde++;
                spiller2.sammentællingPoint();
            } else if (spiller1Håndtegn == 3 && spiller2Håndtegn == 2) { //papir mod saks
                spilleRunde++;
                spiller2.sammentællingPoint();
            } else if (spiller1Håndtegn == 1 && spiller2Håndtegn == 3) { //sten mod papir
                spilleRunde++;
                spiller2.sammentællingPoint();
            } else if (spiller1Håndtegn == 2 && spiller2Håndtegn == 3) { //saks mod papir
                spilleRunde++;
                spiller1.sammentællingPoint();
            } else if (spiller1Håndtegn == 3 && spiller2Håndtegn == 1) { //papir mod sten
                spilleRunde++;
                spiller1.sammentællingPoint();
            }
            System.out.println(" ");//ekstra linjeskift
            System.out.println("Rundens resultat: ");
            System.out.println("Spiller: " + navnSpiller1);
            System.out.println("Valgte: " + håndtegnArray[spiller1Håndtegn-1]);
            System.out.println("Point spiller 1: ");
            System.out.println(spiller1.getSpillerPoint());
            System.out.println("Spiller: " + navnSpiller2);
            System.out.println("Valgte: " + håndtegnArray[spiller2Håndtegn-1]);
            System.out.println("Point spiller 2: ");
            System.out.println(spiller2.getSpillerPoint());
            System.out.println(" "); //ekstra linjeskift

            if (spiller1.getSpillerPoint() == 2) {
                System.out.println("Juhu vindenren er: " + spiller1.getSpillerNavn());
                SENTINEL = 5;
            } else if (spiller2.getSpillerPoint() == 2) {
                System.out.println("Juhu vindenren er: " + spiller1.getSpillerNavn());
                SENTINEL = 5;
            }

        }
        System.out.println("udprint efter begge if elser");

    }
}
