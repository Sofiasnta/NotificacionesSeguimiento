package co.edu.uniquindio.poo.model;

public class EnviarNotificacion implements Command {

    private Notificacion notificacion;

    public EnviarNotificacion(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    public void execute() {
        notificacion.send();
    }

}
