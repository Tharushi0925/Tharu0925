public class LightDimCommand implements Command {
    private Light light;
    private int level;

    public LightDimCommand(Light light, int level) {
        this.light = light;
        this.level = level;
    }

    @Override
    public void execute() {
        light.dim(level);
    }

    @Override
    public void undo() {
        light.dim(100); // restore to full brightness
    }
}