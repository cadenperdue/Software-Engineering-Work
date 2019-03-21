public class TVUpCommand extends Command {
	TV tv;
	
	public TVUpCommand(TV tv) {
		this.tv = tv;
        commandName = "tv up";
	}
 
	public void execute() {
		if(tv.isTVOn())
		{
			tv.incChannel();
		}
		else
		{
			System.out.println("The TV is Off");
		}
	}
}
