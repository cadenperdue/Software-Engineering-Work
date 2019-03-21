public class CeilingFanOnCommand extends Command {
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
        commandName = "ceiling fan on";
	}
	public void execute() {
		ceilingFan.high();
	}
}
