package command;

public class LivingRoomOnCommand implements Command{
    Light light;
    String name="living room";

    public LivingRoomOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on(name);
    }
}
