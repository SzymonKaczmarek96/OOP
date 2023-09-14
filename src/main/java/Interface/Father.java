package Interface;

public class Father implements FamilyMember {

    private String name;


    public Father(String name) {
        this.name = name;
    }

    @Override
    public void introduceYourself() {
        System.out.println(name+ ": I'm your father");
    }

    @Override
    public boolean isAdult() {
        return true;
    }
}
