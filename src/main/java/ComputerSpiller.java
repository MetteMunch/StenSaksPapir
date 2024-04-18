import java.util.Random;

public class ComputerSpiller extends Spiller {

    private Random random;

    public ComputerSpiller(String spillerNavn) {
        super(spillerNavn);
        random = new Random();
    }

    @Override
    public int vælgHåndtegn() {
        int valgtHåndtegn = 4;
        valgtHåndtegn = random.nextInt(1, 4);
        return valgtHåndtegn;
    }


}
