package ar.edu.unahur.obj2;

public class CommandLuzTecOn implements Command{

    private LuzTecho luzTecho;

    public void executed() {
        luzTecho.on();
        luzTecho.dim();
    }

    public CommandLuzTecOn(LuzTecho luzTecho) {
        this.luzTecho = luzTecho;
    }
}
