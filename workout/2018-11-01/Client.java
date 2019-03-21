//Code written by Matthew Radermacher & Caden Perdue
public class Client {
  public static void main(String[] args) {
    Hero hero = new Hero("Captain Planet");
	
	hero.downPressed();
	hero.downReleased();
	hero.upPressed();
	hero.hitRolled();
	hero.upReleased();
	hero.upPressed();
	hero.downPressed();
	hero.hitFire();
	hero.upReleased();
	hero.downReleased();
	hero.escPressed();
	hero.hitFire();
  }
}
