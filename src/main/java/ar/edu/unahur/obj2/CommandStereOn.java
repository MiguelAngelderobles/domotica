package ar.edu.unahur.obj2;

public class CommandStereOn implements Command{

    private Stereo stereo;
    public void executed() {
        stereo.on();
    }
}
