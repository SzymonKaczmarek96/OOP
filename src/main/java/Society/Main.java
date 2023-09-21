package Society;

public class Main {

    public static void main(String[] args) {

        Peasant peasant = new Peasant("Peasant1");

        Townsman townsman = new Townsman("Townsman1");

        Soldier soldier = new Soldier("Soldier1");

        King king = new King("King");


        Town town = new Town();

        town.addCitizenToTownList(peasant);
        town.addCitizenToTownList(townsman);
        town.addCitizenToTownList(soldier);
        town.addCitizenToTownList(king);




        System.out.println("The number of peoples who can vote: " + town.howManyCanVote());

         System.out.println(town.whoCanVote());;


    }
}
