package command;

public class StereoOnCommand implements Command{
    Stereo stereo;
    String name="Stereo";

    public StereoOnCommand(Stereo stereo) {
        this.stereo= stereo;
    }

    @Override
    public void execute() {
        stereo.on(name);
    }
}
