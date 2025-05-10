package co.edu.uniquindio.poo.model;

public class NotificacionEmail implements NotificacionStrategyBase {

    @Override
    public void send(Usuario usuario, String message) {
        System.out.println("Email enviado a " + usuario.getEmail());
        System.out.println("Contenido:\n" + message);
    }

}
