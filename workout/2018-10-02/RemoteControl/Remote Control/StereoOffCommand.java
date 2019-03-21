public class StereoOffCommand extends Command {
	Stereo stereo;
 
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
        commandName = "stereo off";
	}
 
	public void execute() {
		stereo.off();
	}
}
