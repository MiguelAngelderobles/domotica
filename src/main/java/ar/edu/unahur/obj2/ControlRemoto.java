package ar.edu.unahur.obj2;

import java.util.List;
import java.util.Optional;

public class ControlRemoto {
    private List<Command> commandControl;

    public ControlRemoto(List<Command> commandControl) {
        this.commandControl = commandControl;
    }

    public void setCommandControl(List<Command> commandControl) {
        this.commandControl = commandControl;
    }

    public void botonOnEjecutado(int numeroSlot) {
        Command command=commandControl.get(numeroSlot);
        command.executed();
    }

    public void botonOffnEjecutado(int numeroSlot) {
        Command command=commandControl.get(numeroSlot);
        command.executed();
    }

}
