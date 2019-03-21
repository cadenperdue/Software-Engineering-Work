import java.util.ArrayList;
public class WizardTowerProxy implements WizardTower{
    public ArrayList<Wizard> wizards = new ArrayList<Wizard>();
    

    private static final int NUM_ALLOWED = 3;
    private static final int MIN_CREDITS = 90;

    private int numWizards = 0;

    private WizardTower tower;

    public WizardTowerProxy(WizardTower tower)
    {
        this.tower = tower;
    }

    public void enter(Wizard wizard){
        int creditsEarned = wizard.credits;
        if (numWizards < NUM_ALLOWED && creditsEarned >= MIN_CREDITS){
            tower.enter(wizard);
            wizards.add(wizard);
            numWizards ++;
        }
        else if (numWizards > NUM_ALLOWED){
            System.out.println("Sorry, too many wizards already in the tower");
        }
        else if (creditsEarned < MIN_CREDITS){
            System.out.println("Sorry, not enough wizard credits earned to enter");
        }
    }
    public void exit(Wizard wizard){
        if(wizards.contains(wizard)){
            System.out.println(wizard.toString() + " has left the building");
        }
        else{
            numWizards --; 
            wizards.remove(wizard);
            tower.exit(wizard);
        }
    }
}
