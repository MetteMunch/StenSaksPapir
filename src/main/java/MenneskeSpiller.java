import java.util.Scanner;

public class MenneskeSpiller extends Spiller {

    Scanner input;


    public MenneskeSpiller(String spillerNavn) {
        super(spillerNavn);
        input = new Scanner(System.in);
    }

    @Override
    public int vælgHåndtegn() {
        int valgtHåndtegn = 4;

        for(Håndtegn håndtegn : Håndtegn.values()){
        System.out.println(håndtegn.toString());
        }
        System.out.println("Vælg hvilket håndtegn du vil vise, angiv nummeret på dit valg.");
        valgtHåndtegn = input.nextInt();
        return valgtHåndtegn;
    }
}
