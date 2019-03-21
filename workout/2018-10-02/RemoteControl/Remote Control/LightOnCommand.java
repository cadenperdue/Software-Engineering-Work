public class LightOnCommand extends Command {
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
        commandName = "light on";
	}

	public void execute() {
		light.on();
	}
}
