package command;

public class KitchenRoomOnCommand implements Command {
    Light light;
    String name="kitchen room";

    public KitchenRoomOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on(name);
    }
}
