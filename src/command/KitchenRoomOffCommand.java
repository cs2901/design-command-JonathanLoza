package command;

public class KitchenRoomOffCommand implements Command {
    Light light;
    String name="kitchen room";

    public KitchenRoomOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off(name);
    }
}
