package command;

public class StereoOffCommand implements Command{
    Stereo stereo;
    String name="Stereo";

    public StereoOffCommand(Stereo stereo) {
        this.stereo= stereo;
    }

    @Override
    public void execute() {
        stereo.off(name);
    }
}
