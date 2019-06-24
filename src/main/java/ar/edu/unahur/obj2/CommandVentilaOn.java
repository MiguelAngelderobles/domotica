package ar.edu.unahur.obj2;

public class CommandVentilaOn implements Command {
    private VentiladorDeTecho ventiladorDeTecho;
    private int cont=0;
    public void executed() {
        cont++;
        if(cont==1){
            ventiladorDeTecho.baja();
        }if(cont==2){
            ventiladorDeTecho.media();
        }if (cont==3){
            ventiladorDeTecho.fuerte();
            cont=0;
        }
       }

    public CommandVentilaOn(VentiladorDeTecho ventiladorDeTecho) {
        this.ventiladorDeTecho = ventiladorDeTecho;
    }
}
