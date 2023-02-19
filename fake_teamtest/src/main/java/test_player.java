
public class test_player {
    
    public static void main(String[] args) {
        
        GoalKeeper goalie1 = new GoalKeeper("Wilmer Jose","1",false);
        Defense defense1 = new Defense("Wilmer","3",false);
        MidFielder midFielder1 = new MidFielder("Johny","8",false);
        Striker striker1 = new Striker("Kevin","10",false);
        
        System.out.println(goalie1.getName());
        
        goalie1.celebrateAGoalSaved();
        
        
        System.out.println(defense1.getName());
        
        defense1.celebrateABlock();
        
        CountPlayersGoals goals = new CountPlayersGoals();
        
        goalie1.addScoredGoal();
        striker1.addScoredGoal();
        midFielder1.addScoredGoal();
        
               
        goals.GoalsCount(goalie1);
        goals.GoalsCount(defense1);
        goals.GoalsCount(midFielder1);
        goals.GoalsCount(striker1);
        
        
        
    }//End main

    

}
