package ar.edu.unahur.obj2;

public class CommandLuzExtOff implements Command {
    private LuzExterior luzExterior;

    public void executed() {
        luzExterior.off();
    }
}