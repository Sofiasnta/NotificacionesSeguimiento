package co.edu.uniquindio.poo.model;

public class MensajeVacio extends Filtro{

    public boolean handle(Notificacion notificacion) {
        if (notificacion.getMessage() == null || notificacion.getMessage().isEmpty()) {
            System.out.println("Mensaje vacío. Notificación cancelada.");
            return false;
        }
        return super.handle(notificacion);
    }

}
