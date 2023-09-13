package Society;

public class Peasant extends Citizen{


    public Peasant(String peasantName) {
        super(peasantName);
    }

    @Override
    public boolean canVote() {
        return false;
    }



}
