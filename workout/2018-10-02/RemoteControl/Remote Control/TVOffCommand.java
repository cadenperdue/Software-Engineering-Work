public class TVOffCommand extends Command {
	TV tv;
	
	public TVOffCommand(TV tv) {
		this.tv = tv;
        commandName = "tv off";
	}
 
	public void execute() {
		if(tv.isTVOn())
		{
			tv.off();
		}
		else
		{
			System.out.println("The TV is Off");
		}
	}
}
