//Code written by Matthew Radermacher & Caden Perdue
import java.util.concurrent.TimeUnit;
public class Hero {
  
  State standing;
  State ducking;
  State diving;
  State invisible;
  State jumping;
  State dead;
  
  
  int credits;
  String name;
  State state;
  public Hero(String name) {
    this.name = name;
    credits = 3;
	
	standing = new Standing(this);
	ducking = new Ducking(this);
	diving = new Diving(this);
	invisible = new Invisible(this);
	jumping = new Jumping(this);
	dead = new Dead(this);
    state = standing;
  }
  
  public void downPressed() {
    state.downPressed();
  }
  
  public void upPressed() {
    state.upPressed();
  }
  
  public void downReleased() {
    state.downReleased();
  }
  
  public void upReleased() {
    state.upReleased();
  }
  
  public synchronized void escPressed() {
      
    state.escPressed();
    try{
        TimeUnit.SECONDS.sleep(5);
    }
    catch(InterruptedException e){
        e.printStackTrace();
    }
    state.timeExpired();
  }
  
  public synchronized void timerExpired() {
    state.timeExpired();
  }
  
  public void hitFire() {
    state.hitFire();
  }
  
  public void hitThrown() {
    state.hitThrown();
  }
  
  public void hitRolled() {
    state.hitRolled();
  }
  
  public State getState() {
    return state;
  }
  
  public void setState(State state) {
    this.state = state;
  }
  
  public State getStanding() {
    return standing;
  }
  
  public State getDucking() {
    return ducking;
  }
  
  public State getDiving() {
    return diving;
  }
  
  public State getInvisible() {
    return invisible;
  }
  
  public State getJumping() {
    return jumping;
  }
  
  public State getDead() {
    return dead;
  }
  
  public boolean hasCredits() {
    return (credits >= 3);
  }
  
  public void decrementCredits() {
    credits -= 3;
  }
}
