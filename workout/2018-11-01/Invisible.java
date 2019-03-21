//Code written by Matthew Radermacher & Caden Perdue
public class Invisible implements State{
    Hero hero;

    public Invisible(Hero hero){
        this.hero = hero;
    }

    public void downPressed(){
        System.out.println(hero.name + " can't do that right now");
    }

    public void upPressed(){
        System.out.println(hero.name + " can't do that right now");
    }

    public void downReleased(){
        System.out.println("You weren't holding down");
    }

    public void upReleased(){
        System.out.println("You weren't holding up");
    }

    public void escPressed(){
        System.out.println("Already invisible");
    }
    public void timeExpired(){
        System.out.println("You are no longer invisible!");
        hero.setState(hero.getStanding());
    }
    public void hitFire(){
        System.out.println(hero.name + " is immune to fire");
    }
    public void hitThrown(){
        System.out.println(hero.name + " is immune to thrown objects");
    }
    public void hitRolled(){
        System.out.println(hero.name + " is immune to rolling objects");
    }
}
