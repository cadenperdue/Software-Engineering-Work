public class StereoVolumeUp extends Command {
	Stereo stereo;
 
	public StereoVolumeUp(Stereo stereo) {
		this.stereo = stereo;
        commandName = "stereo volume up";
	}
 
	public void execute() {
		if(stereo.isStereoOn())
		{
			stereo.incrementVolume();
		}
		else
		{
			System.out.println("The Stereo is Off");
		}
	}
}
