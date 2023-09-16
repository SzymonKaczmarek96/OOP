package Interface;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Mother mother = new Mother("Karolina");

        Father father = new Father("Grzegorz");

        Daughter daughter = new Daughter("Zuzanna");

        Son son = new Son("Kacper");


        List<FamilyMember> familyList = new ArrayList<>();


        familyList.add(mother);
        familyList.add(father);
        familyList.add(daughter);
        familyList.add(son);


        for(FamilyMember familyMember: familyList){

            familyMember.introduceYourself();
            System.out.println("It's adult: " + familyMember.isAdult());
        }


    }
}
