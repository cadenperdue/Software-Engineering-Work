public class Stereo {
	String location;
	
	
	
	int currVol;
	boolean isOn;
	public Stereo(String location) {
		this.location = location;
		currVol = 0;
	}

	public void on() {
		System.out.println(location + " stereo is on");
		isOn = true;
	}

	public void off() {
		System.out.println(location + " stereo is off");
		isOn = false;
	}
	public boolean isStereoOn()
	{
		return isOn;
	}

	public void setCD() {
		System.out.println(location + " stereo is set for CD input");
	}

	public void setDVD() {
		System.out.println(location + " stereo is set for DVD input");
	}

	public void setRadio() {
		System.out.println(location + " stereo is set for Radio");
	}

	public void setVolume(int volume) {
		// code to set the volume
		// valid range: 1-11 (after all 11 is better than 10, right?)
		if(volume >=0 && volume <= 11)
		{
		currVol = volume;
		System.out.println(location + " Stereo volume set to " + volume);
		}
		else if(volume > 11)
		{
			currVol = 11;
			System.out.println(location + " stereo volume is at maximum volume which is 11.");
		}
		else
		{
			currVol = 0;
			System.out.println(location + " stereo volume is at minimum volume which is 0.");
		}
	}
	public void incrementVolume()
	{
		setVolume(currVol + 1);
	}
	public void decrementVolume()
	{
		setVolume(currVol-1);
	}
}

