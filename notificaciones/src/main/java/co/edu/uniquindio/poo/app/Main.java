package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.*;


public class Main {
    public static void main(String[] args) {

        // Crear usuario
        Usuario usuario1 = new Cliente("cliente1@gmail.com", false);

        // Crear notificación
        Notificacion notificacion1 = new Notificacion(usuario1, "Perfil actualizado.");

        // Establecer estrategia
        notificacion1.setStrategy(new NotificacionEmail());

        // Crear cadena de filtros (Chain of Responsibility)
        Filtro filtro1 = new MensajeVacio();
        filtro1.setNext(new UsuarioBloqueado());

        // Validar notificación
        if (filtro1.handle(notificacion1)) {
            // Crear y ejecutar comando (Command)
            Command command1 = new EnviarNotificacion(notificacion1);
            EjecutorDeComando ejecutor = new EjecutorDeComando();
            ejecutor.addCommand(command1);
            ejecutor.executeCommands();
        }
    }
}