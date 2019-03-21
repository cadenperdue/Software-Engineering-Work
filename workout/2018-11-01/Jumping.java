//Code written by Matthew Radermacher & Caden Perdue
public class Jumping implements State{
    Hero hero;

    public Jumping(Hero hero){
        this.hero = hero;
    }

    public void downPressed(){
        System.out.println(hero.name + " is diving");
        hero.setState(hero.getDiving());
    }

    public void upPressed(){
        System.out.println(hero.name + " is already jumping");
    }

    public void downReleased(){
        System.out.println("You weren't holding down");
    }

    public void upReleased(){
        System.out.println(hero.name + " is now standing");
        hero.setState(hero.getStanding());
    }

    public void escPressed(){
        if(hero.hasCredits()){
            System.out.println("You've gone invisible");
            hero.decrementCredits();
            hero.setState(hero.getInvisible());
        }
        else
            System.out.println("You don't have enough credits");
    }
    public void timeExpired(){
        System.out.println("You aren't invisible");
    }
    public void hitFire(){
        System.out.println(hero.name + " has died");
        hero.setState(hero.getDead());
    }
    public void hitThrown(){
        System.out.println(hero.name + " has died");
        hero.setState(hero.getDead());
    }
    public void hitRolled(){
        System.out.println(hero.name + " has dodged the attack");
    }
}
