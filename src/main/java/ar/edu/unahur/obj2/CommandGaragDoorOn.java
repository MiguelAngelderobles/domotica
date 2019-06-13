package ar.edu.unahur.obj2;

public class CommandGaragDoorOn implements Command {
    private PuertaGarage puertaGarage;

    public void executed() {
        puertaGarage.arriba();
    }
}
