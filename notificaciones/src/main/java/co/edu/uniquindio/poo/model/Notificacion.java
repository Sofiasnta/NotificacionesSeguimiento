package co.edu.uniquindio.poo.model;

public class Notificacion {

    private Usuario usuario;
    private String message;
    private NotificacionStrategyBase strategy;

    public Notificacion(Usuario usuario, String message) {
        this.usuario = usuario;
        this.message = message;
    }

    public Usuario getUser() {
        return usuario;
    }

    public String getMessage() {
        return message;
    }

    public void setStrategy(NotificacionStrategyBase strategy) {
        this.strategy = strategy;
    }

    public void send() {
        String formatted = usuario.formatMessage(message);
        strategy.send(usuario, formatted);
    }

}
