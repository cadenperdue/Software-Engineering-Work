public class GarageDoorDownCommand extends Command {
	GarageDoor garageDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
        super.commandName = "garage door down";
	}

	public void execute() {
		garageDoor.up();
	}
}
