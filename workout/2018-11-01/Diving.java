//Code written by Matthew Radermacher & Caden Perdue
public class Diving implements State{
    Hero hero;

    public Diving(Hero hero){
        this.hero = hero;
    }

    public void downPressed(){
        System.out.println(hero.name + " is already diving");
    }

    public void upPressed(){
        System.out.println(hero.name + " already is diving");
    }

    public void downReleased(){
        System.out.println(hero.name + " is now Jumping");
        hero.setState(hero.getJumping());
    }

    public void upReleased(){
        System.out.println(hero.name + " is now Ducking");
        hero.setState(hero.getDucking());
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
        System.out.println("The fire was put out by the water");
    }
    public void hitThrown(){
        System.out.println(hero.name + " was too deep to be hit");
    }
    public void hitRolled(){
        System.out.println(hero.name + " has died");
        hero.setState(hero.getDead());
    }
}
