//Code written by Matthew Radermacher & Caden Perdue
public class Ducking implements State{
    Hero hero;

    public Ducking(Hero hero){
        this.hero = hero;
    }

    public void downPressed(){
        System.out.println(hero.name + " is already ducking");
    }

    public void upPressed(){
        System.out.println(hero.name + " can't jump right now");
    }

    public void downReleased(){
        System.out.println(hero.name + " is now standing");
        hero.setState(hero.getStanding());
    }

    public void upReleased(){
        System.out.println("You weren't holding up");
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
        System.out.println(hero.name + " dodged the object");
    }
    public void hitRolled(){
        System.out.println(hero.name + " has died");
        hero.setState(hero.getDead());
    }
}
