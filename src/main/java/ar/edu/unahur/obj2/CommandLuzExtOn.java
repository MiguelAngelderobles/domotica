package ar.edu.unahur.obj2;

public class CommandLuzExtOn implements Command {
    private LuzExterior luzExterior;
    public void executed() {
        luzExterior.on();
    }
}
