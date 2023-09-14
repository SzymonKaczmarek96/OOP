package Interface;

public class Mother implements FamilyMember{


    private String name;

    public Mother(String name) {
        this.name = name;
    }

    @Override
    public void introduceYourself() {
        System.out.println(name + ": I'm mother")
        ;
    }

    @Override
    public boolean isAdult() {
        return true;
    }
}
