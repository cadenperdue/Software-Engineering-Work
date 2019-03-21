public class TVOnCommand extends Command {
	TV tv;
	
	public TVOnCommand(TV tv) {
		this.tv = tv;
        commandName = "tv on";
	}
 
	public void execute() {
		if(!tv.isTVOn())
		{
			tv.on();
		}
		else
		{
			System.out.println("The TV is On");
		}
	}
}
