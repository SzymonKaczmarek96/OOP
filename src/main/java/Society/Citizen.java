package Society;

public abstract class Citizen {

    private String name;


    public Citizen(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean canVote();



}
