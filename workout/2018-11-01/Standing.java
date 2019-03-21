//Code written by Matthew Radermacher & Caden Perdue
public class Standing implements State{
    Hero hero;

    public Standing(Hero hero){
        this.hero = hero;
    }

    public void downPressed(){
        System.out.println(hero.name + " is ducking");
        hero.setState(hero.getDucking());
    }

    public void upPressed(){
        System.out.println(hero.name + " is jumping");
        hero.setState(hero.getJumping());
    }

    public void downReleased(){
        System.out.println("You weren't holding down");
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
        System.out.println(hero.name + " has died to fire");
        hero.setState(hero.getDead());
    }
    public void hitThrown(){
        System.out.println(hero.name + " has died to a thrown object");
        hero.setState(hero.getDead());
    }
    public void hitRolled(){
        System.out.println(hero.name + " has died to a rolled object");
        hero.setState(hero.getDead());
    }
}
