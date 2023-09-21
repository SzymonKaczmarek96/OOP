package Society;

import java.util.ArrayList;
import java.util.List;

public class Town {

    private List<Citizen> citizensList = new ArrayList<>();

    public void addCitizenToTownList(Citizen citizens) {
        citizensList.add(citizens);
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

    public List<String> whoCanVote() {
        List <String> voters = new ArrayList<>();

        for(Citizen citizen: citizensList){

            if(citizen.canVote()) {
                voters.add(citizen.getName());

            }
        }
        return voters;
    }
}
