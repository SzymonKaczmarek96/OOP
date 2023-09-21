package Interface;

public class Daughter implements FamilyMember{

    private String name;

    public Daughter(String name) {
        this.name = name;
    }

    @Override
    public void introduceYourself() {
        System.out.println(name + ": I'm daughter ;) ");
    }

    @Override
    public boolean isAdult() {
        return false;
    }
}
