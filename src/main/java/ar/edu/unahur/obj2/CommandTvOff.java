package ar.edu.unahur.obj2;

public class CommandTvOff implements Command {
    private Television television;
    public void executed() {
        television.off();
    }

    public CommandTvOff(Television television) {
        this.television = television;
    }
}
