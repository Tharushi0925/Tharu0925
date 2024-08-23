// Concrete Light classes
public class KitchenRoomLight implements Light {
    private int brightness = 0;

    @Override
    public void on() {
        brightness = 100;
        System.out.println("Kitchen light is on");
    }

    @Override
    public void off() {
        brightness = 0;
        System.out.println("Kitchen light is off");
    }

    @Override
    public void dim(int level) {
        brightness = level;
        System.out.println("Kitchen light is dimmed to " + level);
    }
}