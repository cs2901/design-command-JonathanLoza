package command;

public class CeilingFanOnCommand implements Command{
    Ceiling ceiling;
    String name="fan";

    public CeilingFanOnCommand(Ceiling light) {
        this.ceiling = light;
    }

    @Override
    public void execute() {
        ceiling.on(name);
    }
}
