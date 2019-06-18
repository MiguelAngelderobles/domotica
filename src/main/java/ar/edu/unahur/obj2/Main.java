package ar.edu.unahur.obj2;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        LuzExterior luzExterior = new LuzExterior();
        LuzJardin luzJardin = new LuzJardin();
        LuzTecho luzTecho = new LuzTecho();
        VentiladorDeTecho ventiladorDeTecho = new VentiladorDeTecho();
        Television television = new Television();
        Stereo stereo = new Stereo();
        PuertaGarage puertaGarage = new PuertaGarage();
        DateTime dateTime1=new DateTime("2019-12-13");
        luzJardin.definirHoraAmanecer(dateTime1);
        luzJardin.definirHoraAnochecer(dateTime1);
        television.definirCanal(12);
        television.definirVolumen(25);
        stereo.setCd("nuc");
        stereo.setDvd("nuc");
        stereo.setRadio("nuc2");
        stereo.setVolumen(25);

        List<Command> liston = new ArrayList<>();
        List<Command> listoff=new ArrayList<>();
        ControlRemoto controlRemoto = new ControlRemoto(liston,listoff);


        CommandGaragDoorOff commandGaragDoorOff = new CommandGaragDoorOff(puertaGarage);
        CommandGaragDoorOn commandGaragDoorOn = new CommandGaragDoorOn(puertaGarage);
        CommandStereOff commandStereOff = new CommandStereOff(stereo);
        CommandStereOn commandStereOn = new CommandStereOn(stereo);
        CommandTvOff commandTvOff = new CommandTvOff(television);
        CommandTvOn commandTvOn = new CommandTvOn(television);
        CommandVentilaOff commandVentilaOff = new CommandVentilaOff(ventiladorDeTecho);
        CommandVentilaOn commandVentilaOn = new CommandVentilaOn(ventiladorDeTecho);
        CommandLuzExtOff commandLuzExtOff = new CommandLuzExtOff(luzExterior);
        CommandLuzExtOn commandLuzExtOn = new CommandLuzExtOn(luzExterior);
        CommandLuzJarOff commandLuzJarOff = new CommandLuzJarOff(luzJardin);
        CommandLuzJarOn commandLuzJarOn = new CommandLuzJarOn(luzJardin);
        CommandLuzTecOff commandLuzTecOff = new CommandLuzTecOff(luzTecho);
        CommandLuzTecOn commandLuzTecOn = new CommandLuzTecOn(luzTecho);


        listoff.add(commandGaragDoorOff);
        liston.add(commandGaragDoorOn);
        listoff.add(commandLuzExtOff);
        liston.add(commandLuzExtOn);
        listoff.add(commandLuzJarOff);
        liston.add(commandLuzJarOn);
        listoff.add(commandLuzTecOff);
        liston.add(commandLuzTecOn);
        listoff.add(commandStereOff);
        liston.add(commandStereOn);
        listoff.add(commandTvOff);
        liston.add(commandTvOn);
        listoff.add(commandVentilaOff);
        liston.add(commandVentilaOn);

        controlRemoto.botonOffnEjecutado(1);
        controlRemoto.botonOnEjecutado(1);
        controlRemoto.botonOnEjecutado(4);
    }
}
