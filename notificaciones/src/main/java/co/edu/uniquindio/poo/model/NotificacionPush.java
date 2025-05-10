package co.edu.uniquindio.poo.model;

public class NotificacionPush implements NotificacionStrategyBase {

    @Override
    public void send(Usuario usuario, String message) {
        System.out.println("🔔 Push enviado a " + usuario.getEmail());
        System.out.println("Contenido:\n" + message);
    }

}
