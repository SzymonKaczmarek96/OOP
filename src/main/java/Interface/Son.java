package Interface;

public class Son implements FamilyMember {

    private String name;


    public Son(String name) {
        this.name = name;
    }

    @Override
    public void introduceYourself() {
        System.out.println(name + ": Who's asking? ");
    }

    @Override
    public boolean isAdult() {
        return false;
    }

}
