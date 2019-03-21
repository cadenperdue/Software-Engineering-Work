//Code written by Matthew Radermacher & Caden Perdue
public interface State{
    public void downPressed();
    public void upPressed();
    public void downReleased();
    public void upReleased();
    public void escPressed();
    public void timeExpired();
    public void hitFire();
    public void hitThrown();
    public void hitRolled();
}
