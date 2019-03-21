public class GarageDoorUpCommand extends Command {
	GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
        commandName = "garage door up";
	}

	public void execute() {
		garageDoor.up();
	}
}
