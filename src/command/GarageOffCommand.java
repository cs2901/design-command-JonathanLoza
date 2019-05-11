package command;

public class GarageOffCommand implements Command{
    Door door;
    String name="garage";

    public GarageOffCommand(Door puerta) {
        this.door= puerta;
    }

    @Override
    public void execute() {
        door.off(name);
    }
}
