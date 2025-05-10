package co.edu.uniquindio.poo.model;

public class Filtro {

    protected Filtro next;

    public void setNext(Filtro next) {
        this.next = next;
    }

    public boolean handle(Notificacion notificacion) {
        if (next != null) return next.handle(notificacion);
        return true;
    }

}
