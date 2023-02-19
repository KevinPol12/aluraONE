
public class GoalKeeper extends Player {
    
    public GoalKeeper(String name, String number, boolean injured) {
        super(name, number, injured);
    }
    
    private int goalsSaved;

    public int getGoalsSaved() {
        return goalsSaved;
    }

    public void setGoalsSaved(int goalsSaved) {
        this.goalsSaved = goalsSaved;
    }
    
    public void celebrateAGoalSaved(){
            System.out.println("Impressive save, I am the best goal keeper ever!!!");
    }

    

}
