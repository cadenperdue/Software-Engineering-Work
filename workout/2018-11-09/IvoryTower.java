import java.util.ArrayList;
public class IvoryTower implements WizardTower{
    ArrayList<Wizard> wizards = new ArrayList<Wizard>();

    public void enter(Wizard wizard){
            wizards.add(wizard);
            System.out.println(wizard.toString() + " has entered the building");
    }
    public void exit(Wizard wizard){
            wizards.remove(wizard);
            System.out.println(wizard.toString() + " has left the building");
    }
}
