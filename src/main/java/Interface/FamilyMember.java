package Interface;

public interface FamilyMember {


    default void introduceYourself() {
        System.out.println("I am just a simple family member");
    }


    boolean isAdult();


}
