package ar.edu.unahur.obj2;

public class CommandTvOn implements Command {
    private Television television;
    public void executed() {
        television.on();
    }
}
