public class TV {
	String location;
	int channel;
	
	
	
	boolean isOn;
	public TV(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println("TV is on");
		isOn = true;
	}

	public void off() {
		System.out.println("TV is off");
		isOn = false;
	}
	public boolean isTVOn()
	{
		return isOn;
	}

	public void setInputChannel() {
		this.channel = 3;
		System.out.println("Channel is set for VCR");
	}
	public void setChannel(int input)
	{
		this.channel = input;
		System.out.println("Channel set to: " + input);
	}
	public void incChannel()
	{
		setChannel(this.channel + 1);
	}
	public void decChannel()
	{
		setChannel(this.channel +1);
	}
}

