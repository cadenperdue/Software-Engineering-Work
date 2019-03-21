public class HottubOffCommand extends Command {
	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
        commandName = "hot tub off";
	}

	public void execute() {
		hottub.cool();
		hottub.off();
	}
}
