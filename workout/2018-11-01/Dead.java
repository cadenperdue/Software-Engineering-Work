//Code written by Matthew Radermacher & Caden Perdue
public class Dead implements State{
    Hero hero;

    public Dead(Hero hero){
        this.hero = hero;
    }

    public void downPressed(){
        System.out.println("sry u ded");
        
    }

    public void upPressed(){
        System.out.println("sry u ded");
        
    }

    public void downReleased(){
        System.out.println("sry u ded");
    }

    public void upReleased(){
        System.out.println("sry u ded");
    }

    public void escPressed(){
         System.out.println("sry u ded");
    }
    public void timeExpired(){
        System.out.println("sry u ded");
    }
    public void hitFire(){
        System.out.println(hero.name + "He's already dead don't burn him!");
    }
    public void hitThrown(){
        System.out.println("What kind of sick freak is still throwing things at a dead guy?!");
        
    }
    public void hitRolled(){
        System.out.println("You can stop now!");
        
    }
}
