public class LivingRoomLight implements Light {
    private int brightness = 0;

    @Override
    public void on() {
        brightness = 100;
        System.out.println("Living room light is on");
    }

    @Override
    public void off() {
        brightness = 0;
        System.out.println("Living room light is off");
    }

    @Override
    public void dim(int level) {
        brightness = level;
        System.out.println("Living room light is dimmed to " + level);
    }
}