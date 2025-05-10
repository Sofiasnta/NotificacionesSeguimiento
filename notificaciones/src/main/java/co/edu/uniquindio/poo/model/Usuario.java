package co.edu.uniquindio.poo.model;

public abstract class Usuario {

    protected String email;
    protected boolean blocked;

    public Usuario(String email, boolean blocked) {
        this.email = email;
        this.blocked = blocked;
    }

    public String getEmail() { return email; }
    public boolean isBlocked() { return blocked; }


    public final String formatMessage(String Message) {
        return getHeader() + "\n" + personalizeMessage(Message) + "\n" + getFooter();
    }

    protected abstract String getHeader();
    protected abstract String personalizeMessage(String message);
    protected abstract String getFooter();


}
