public class TVDownCommand extends Command {
	TV tv;
	
	public TVDownCommand(TV tv) {
		this.tv = tv;
        commandName = "tv down";
	}
 
	public void execute() {
		if(tv.isTVOn())
		{
			tv.decChannel();
		}
		else
		{
			System.out.println("The TV is Off");
		}
	}
}
