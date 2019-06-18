package ar.edu.unahur.obj2;

public class CommandLuzJarOn implements Command{
    private LuzJardin luzJardin;
    public void executed() {
        luzJardin.manualOn();
    }

    public CommandLuzJarOn(LuzJardin luzJardin) {
        this.luzJardin = luzJardin;
    }
}
