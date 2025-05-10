package co.edu.uniquindio.poo.model;

public class NotificacionSMS implements NotificacionStrategyBase {

    @Override
    public void send(Usuario usuario, String message) {
        System.out.println("SMS enviado a " + usuario.getEmail());
        System.out.println("Contenido:\n" + message);
    }

}
