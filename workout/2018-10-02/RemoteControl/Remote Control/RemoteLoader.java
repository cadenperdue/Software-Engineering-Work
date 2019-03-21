public class RemoteLoader {
 
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
 
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan= new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");
		TV tv = new TV("Living Room");
        Hottub hottub= new Hottub("Hot Tub");
        NoCommand noCom = new NoCommand();
  
    
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);
		LightOnCommand livingRoomLightOn = 
				new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = 
				new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = 
				new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = 
				new LightOffCommand(kitchenLight);
  
		CeilingFanOnCommand ceilingFanOn = 
				new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = 
				new CeilingFanOffCommand(ceilingFan);
 
		GarageDoorUpCommand garageDoorUp =
				new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown =
				new GarageDoorDownCommand(garageDoor);
 

		StereoOnWithCDCommand stereoOnWithCD =
				new StereoOnWithCDCommand(stereo);
		StereoOffCommand  stereoOff =
				new StereoOffCommand(stereo);
		StereoVolumeUp stereoVolUp = 
                new StereoVolumeUp(stereo);
		StereoVolumeDown stereoVolDown = 
                new StereoVolumeDown(stereo);


		TVOnCommand tvON = 
                new TVOnCommand(tv);
		TVOffCommand tvOff = 
                new TVOffCommand(tv);
		TVUpCommand tvUP = 
                new TVUpCommand(tv);
		TVDownCommand tvDown = 
                new TVDownCommand(tv);
        DisplayLog log = 
                new DisplayLog(remoteControl);
       
        Command[] partyOn = { kitchenLightOn, livingRoomLightOn, hottubOn, stereoOnWithCD };
        Command[] partyOff = { kitchenLightOff, livingRoomLightOff, hottubOff, stereoOff }; 
        MacroCommand partyOnMacro = new MacroCommand("party on", partyOn);
        MacroCommand partyOffMacro = new MacroCommand("party off", partyOff);

		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
		remoteControl.setCommand(4, stereoVolUp, stereoVolDown);
		remoteControl.setCommand(5, tvON, tvOff);
		//remoteControl.setCommand(6, tvUP, tvDown);
        remoteControl.setCommand(6, noCom, log); 
		System.out.println(remoteControl);
 
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(4);
		//remoteControl.offButtonWasPushed(4);
		remoteControl.onButtonWasPushed(4);
		//remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(3);
		remoteControl.onButtonWasPushed(5);
		remoteControl.offButtonWasPushed(5);
		//remoteControl.onButtonWasPushed(6);
		//remoteControl.onButtonWasPushed(6);
		//remoteControl.onButtonWasPushed(6);
        remoteControl.onButtonWasPushed(6);
        remoteControl.offButtonWasPushed(6);
        //remoteControl.onButtonWasPushed(7);
        //remoteControl.offButtonWasPushed(7);
	}
}

