package ar.edu.unahur.obj2;

public class CommandVentilaOn implements Command {
    private VentiladorDeTecho ventiladorDeTecho;

    public void executed() {
        ventiladorDeTecho.media();
    }
}
