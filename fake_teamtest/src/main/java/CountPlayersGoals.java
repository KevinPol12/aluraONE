
public class CountPlayersGoals {
    
    private int goalCount;
    
    public void GoalsCount(Player player){
        this.goalCount+=player.getScoredGoals();
        System.out.println("Total goals of the team is: "+this.goalCount);
    }

    

}
