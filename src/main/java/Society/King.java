package Society;

public class King extends Citizen {
    @Override
    public boolean canVote() {
        return false;
    }
}
