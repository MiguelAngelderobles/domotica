package ar.edu.unahur.obj2;

public class CommandGaragDoorOff implements Command {
    private PuertaGarage puertaGarage;
    public void executed() {
        puertaGarage.abajo();
    }
}
