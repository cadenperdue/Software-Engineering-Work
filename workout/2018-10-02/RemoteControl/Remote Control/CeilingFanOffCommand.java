public class CeilingFanOffCommand extends Command {
	CeilingFan ceilingFan;
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
        commandName = "ceiling fan off";
	}
	public void execute() {
		ceilingFan.off();
	}
}
