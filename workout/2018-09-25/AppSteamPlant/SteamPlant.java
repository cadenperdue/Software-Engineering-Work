public class SteamPlant{
    public static final double MAX_PRESSURE = 10;
    public static final double MIN_PRESSURE = 5;
    public static final double INITIAL_PRESSURE = 7;
    public static final int INITIAL_HEAT_AVAILABLE = 2000;
    public double currentPressure;
    public int heatAvailable;
    private static SteamPlant uniquePlant;
    //Steam Plant constructor. Sets currentPressure and heatAvailable
    private SteamPlant()
    {
        currentPressure = INITIAL_PRESSURE;
        heatAvailable = INITIAL_HEAT_AVAILABLE;
    }
    //Synchronized method to create steamPlant objects. This method is used to ensure only a single instance
    //of this object exists, even when being accessed by multiple threads simultaneously
    public static synchronized SteamPlant getSteamPlant(){
        if (uniquePlant == null){
            uniquePlant = new SteamPlant();
        }
        return uniquePlant;
    }
    //method for individual buildings to collect heat. Remove h units of heat from heatAvailable if there are enough
    //otherwise return what was available 
    //This method is synchronized so that threads don't overlap and take what is no longer available
    public synchronized int consumeHeat(int h)
    {
        if (h >= heatAvailable)
        {
            heatAvailable -= h;
            System.out.println("consumeHeat - curr heatAvailable: " + heatAvailable + " | curr Pressure : " + currentPressure + 
                                    " | param passed = " + h + " | returned: " + h);
            return h;
        }
        else
        {
            int temp = heatAvailable;
            heatAvailable = 0;
	    System.out.println("consumeHeat - curr heatAvailable: " + heatAvailable + " | curr Pressure : " + currentPressure + 
                                    " | param passed = " + h + " | returned: " + temp);
            return temp;
        }
    }
    
    //setter method for  currentPressure
    //ensures that currentPressure does not exceed max or go below min
    public void setCurrentPressure(double p)
    {
        if(p > MAX_PRESSURE)
            currentPressure = MAX_PRESSURE;
        else if(p < MIN_PRESSURE)
            currentPressure = MIN_PRESSURE;
        else
            currentPressure = p;
    }
    
    //method to change currentPressure
    //also ensures that currentPressure doesn't exceed max or go below min
    public double changeCurrentPressure(double p)
    {
        double potentialPressure = currentPressure + p;
        if(potentialPressure > MAX_PRESSURE)
         {
             currentPressure = MAX_PRESSURE;
             return currentPressure;
         }
         else if(potentialPressure < MIN_PRESSURE)
         {
             currentPressure = MIN_PRESSURE;
             return currentPressure;
         }
         else
         {
             currentPressure = potentialPressure;
             return currentPressure;
         }
    }
    
    //method to simulate the steamPlant running and producing heat based on available pressure
    //synchronized to ensure all values are updated when method is being accessed by multiple threads
    public synchronized void timeTick()
    {
        double heatIncrease = (currentPressure - 2) * 400;
        if (heatIncrease > 0)
        {
            heatAvailable += heatIncrease;
		    System.out.println("timeTick - curr heatAvailable: " + heatAvailable + " | curr Pressure : " + currentPressure);
            
        }
	    else{
		System.out.println("timeTick- curr heatAvailable: " + heatAvailable + " | curr Pressure : " + currentPressure);
	}
    }       
}
