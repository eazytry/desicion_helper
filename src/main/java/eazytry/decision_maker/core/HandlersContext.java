package eazytry.decision_maker.core;

import eazytry.decision_maker.handler.Handler;
import eazytry.decision_maker.factory.HandlersFactory;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

public class HandlersContext {
    private static final String START_MESSAGE = STR."Введите номер помощника: (для завершения программы введите \{SystemCommands.EXIT.toString().toLowerCase()})";
    private final List<Handler> handlers;

    public HandlersContext() {
        this.handlers = HandlersFactory.getHandlers();
    }

    public void printHandlers(OutputStream outputStream) throws IOException {
        var writer = new OutputStreamWriter(outputStream);
        writer.write(START_MESSAGE + "\n");
        for (int i = 0; i < handlers.size(); i++) {
            writer.write(i + ". " + handlers.get(i).getName() + "\n");
        }
        writer.flush();
    }

    public Handler getHandler(int index) {
        return handlers.get(index);
    }
}
