package ar.edu.unahur.obj2;

public class CommandVentilaOff implements Command {
    private VentiladorDeTecho ventiladorDeTecho;

    public void executed() {
        ventiladorDeTecho.apagar();
    }

    public CommandVentilaOff(VentiladorDeTecho ventiladorDeTecho) {
        this.ventiladorDeTecho = ventiladorDeTecho;
    }
}
