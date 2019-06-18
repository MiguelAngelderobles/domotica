package ar.edu.unahur.obj2;

public class CommandStereOff implements Command{
    private Stereo stereo;
    public void executed() {
        stereo.off();
    }

    public CommandStereOff(Stereo stereo) {
        this.stereo = stereo;
    }
}
