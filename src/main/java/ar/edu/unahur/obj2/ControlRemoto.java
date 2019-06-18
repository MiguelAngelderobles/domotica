package ar.edu.unahur.obj2;

import java.util.List;
import java.util.Optional;

public class ControlRemoto {
    private List<Command> commandControlon;
    private List<Command> commandControloff;
    public ControlRemoto(List<Command> commandControlon,List<Command> commandControloff) {

        this.commandControlon = commandControlon;
        this.commandControloff=commandControloff;
    }

    public void setCommandControlon(Command command) {
        commandControlon.add(command);
    }

    public void setGetCommandControloff(List<Command> getCommandControloff) {
        this.commandControloff = getCommandControloff;
    }

    public void botonOnEjecutado(int numeroSlot) {
        commandControlon.get(numeroSlot).executed();

    }

    public void botonOffnEjecutado(int numeroSlot) {
        commandControloff.get(numeroSlot).executed();
    }

}
