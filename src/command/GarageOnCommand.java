package command;

public class GarageOnCommand implements Command{
    Door door;
    String name="garage";

    public GarageOnCommand(Door puerta) {
        this.door= puerta;
    }

    @Override
    public void execute() {
        door.on(name);
    }
}
