// Test class
public class Test {
    public static void main(String[] args) {
        KitchenRoomLight kitchenLight = new KitchenRoomLight();
        LivingRoomLight livingRoomLight = new LivingRoomLight();

        LightOnCommand kitchenOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenOff = new LightOffCommand(kitchenLight);
        LightDimCommand kitchenDim = new LightDimCommand(kitchenLight, 50);

        LightOnCommand livingRoomOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomOff = new LightOffCommand(livingRoomLight);
        LightDimCommand livingRoomDim = new LightDimCommand(livingRoomLight, 75);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(kitchenOn);
        remote.executeCommand();
        remote.setCommand(kitchenOff);
        remote.executeCommand();
        remote.undoLastCommand();
        remote.setCommand(kitchenDim);
        remote.executeCommand();

        remote.setCommand(livingRoomOn);
        remote.executeCommand();
        remote.setCommand(livingRoomOff);
        remote.executeCommand();
        remote.undoLastCommand();
        remote.setCommand(livingRoomDim);
        remote.executeCommand();
    }
}