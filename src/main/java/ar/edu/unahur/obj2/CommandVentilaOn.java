package ar.edu.unahur.obj2;

public class CommandVentilaOn implements Command {
    private VentiladorDeTecho ventiladorDeTecho;

    public void executed() {
        ventiladorDeTecho.baja();
        ventiladorDeTecho.media();
        ventiladorDeTecho.fuerte();
    }

    public CommandVentilaOn(VentiladorDeTecho ventiladorDeTecho) {
        this.ventiladorDeTecho = ventiladorDeTecho;
    }
}
