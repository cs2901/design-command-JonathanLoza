package command;

public class CeilingFanOffCommand implements Command{
    Ceiling ceiling;
    String name="fan";

    public CeilingFanOffCommand(Ceiling light) {
        this.ceiling = light;
    }

    @Override
    public void execute() {
        ceiling.off(name);
    }
}
