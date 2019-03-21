public class LivingroomLightOnCommand extends Command {
	Light light;

	public LivingroomLightOnCommand(Light light) {
		this.light = light;
        commandName = "living room light on";
	}

	public void execute() {
		light.on();
	}
}
