package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class EjecutorDeComando {

    private List<Command> queue = new ArrayList<>();

    public void addCommand(Command command) {
        queue.add(command);
    }

    public void executeCommands() {
        for (Command command : queue) {
            command.execute();
        }
        queue.clear();
    }

}
