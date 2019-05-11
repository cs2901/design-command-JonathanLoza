package command;

public class LivingRoomOffCommand implements Command {
    Light light;
    String name="living room";

    public LivingRoomOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off(name);
    }
}
