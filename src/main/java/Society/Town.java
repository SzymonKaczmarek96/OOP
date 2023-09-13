package Society;

import java.util.ArrayList;
import java.util.List;

public class Town {

    private List<Citizen> citizensList = new ArrayList<>();


    public void addCitizenToTownList(Citizen citizens) {

        citizensList.add(citizens);

    }

    public List<Citizen> getCitizensList() {
        return citizensList;
    }

    public int howManyCanVote() {
        int howMany = 0;

        for(Citizen citizen: citizensList){

            if(citizen.canVote()){
                howMany ++;
            }
        }

        return howMany;


    }

    public void whoCanVote() {

        for(Citizen citizen: citizensList){

            if(citizen.canVote()) {

                System.out.println(citizen.getName());
            }


        }

    }


}
