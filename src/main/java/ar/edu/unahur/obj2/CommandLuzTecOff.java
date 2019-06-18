package ar.edu.unahur.obj2;

public class CommandLuzTecOff implements Command {
    private LuzTecho luzTecho;
    public void executed() {
        luzTecho.off();
    }

    public CommandLuzTecOff(LuzTecho luzTecho) {
        this.luzTecho = luzTecho;
    }
}
