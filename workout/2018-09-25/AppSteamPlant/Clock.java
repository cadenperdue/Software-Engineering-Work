import java.util.*;
import java.util.concurrent.TimeUnit;
public class Clock implements Runnable{
    public SteamPlant steamPlant;
   
   
    //initialized a steamPlant object if one has not already been created 
    public Clock()
    {
        steamPlant = SteamPlant.getSteamPlant();
    }

    public void run()
    {
        int rangeMin = -1;
        int rangeMax = 1;
        while(true)
        {
            try
            {
                TimeUnit.SECONDS.sleep(5);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }

            steamPlant.timeTick();
            Random r = new Random();
            double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
            steamPlant.changeCurrentPressure(randomValue);
        }
    }
}
