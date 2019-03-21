public class mainTest{
    
    public static void main(String[] args){
        WizardTowerProxy proxy = new WizardTowerProxy(new IvoryTower());
        Wizard jeff = new Wizard("jeff", 90);
        Wizard tom = new Wizard("tom", 50);
        Wizard jenny = new Wizard("jenny", 100);
        Wizard zeke = new Wizard("zeke", 90);
        Wizard carl = new Wizard("carl", 90);

        proxy.enter(jeff);
        proxy.enter(tom);
        proxy.enter(jenny);
        proxy.enter(zeke);
        proxy.enter(carl);
        proxy.exit(jeff);
        proxy.enter(carl);
        
    }
}
