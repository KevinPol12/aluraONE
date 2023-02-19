
public abstract class Player {
    
    private String name;
    private String number;
    private boolean injured;
    private int scoredGoals;
    
    public Player(String name,String number, boolean injured){
        this.name=name;
        this.number=number;
        this.injured=injured;
        this.scoredGoals=0;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    public void addScoredGoal() {
        this.scoredGoals += 1;
    }

    public boolean isInjured() {
        return injured;
    }

    public void setInjured(boolean injured) {
        this.injured = injured;
    }
    
    
    

    

}
