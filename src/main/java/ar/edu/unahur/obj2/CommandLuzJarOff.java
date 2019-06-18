package ar.edu.unahur.obj2;

public class CommandLuzJarOff implements Command{
    private LuzJardin luzJardin;

    public void executed() {
        luzJardin.manualOff();
    }

    public CommandLuzJarOff(LuzJardin luzJardin) {
        this.luzJardin = luzJardin;
    }
}
