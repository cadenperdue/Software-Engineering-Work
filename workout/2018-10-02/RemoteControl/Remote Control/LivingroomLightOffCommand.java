public class LivingroomLightOffCommand extends Command {
	Light light;

	public LivingroomLightOffCommand(Light light) {
		this.light = light;
        commandName = "living room light off";
	}

	public void execute() {
		light.off();
	}
}
