package co.edu.uniquindio.poo.model;

public class UsuarioBloqueado extends Filtro {

    public boolean handle(Notificacion notificacion) {
        if (notificacion.getUser().isBlocked()) {
            System.out.println("Usuario bloqueado. Notificación cancelada.");
            return false;
        }
        return super.handle(notificacion);
    }

}
