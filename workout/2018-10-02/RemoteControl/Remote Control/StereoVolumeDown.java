public class StereoVolumeDown extends Command {
	Stereo stereo;
 
	public StereoVolumeDown(Stereo stereo) {
		this.stereo = stereo;
        commandName = "stereo volume down";
	}
 
	public void execute() {
		if(stereo.isStereoOn())
		{
			stereo.decrementVolume();
		}
		else
		{
			System.out.println("The Stereo is Off");
		}
	}
}
