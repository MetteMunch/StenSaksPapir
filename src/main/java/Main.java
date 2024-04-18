public class Main {

        public static void main(String[] args) {
            MenneskeSpiller spiller1 = new MenneskeSpiller("Mette");
            ComputerSpiller spiller2 = new ComputerSpiller("Computer");

            StenSaksPapirSpil nytSpil = new StenSaksPapirSpil(spiller1, spiller2);

            System.out.println("Velkommen til StenSaksPapir");
            System.out.println("Vi spiller bedst ud af 3");

            nytSpil.startSpil();


        }

}
