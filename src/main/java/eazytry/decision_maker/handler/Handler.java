package eazytry.decision_maker.handler;

import java.io.IOException;
import java.io.OutputStream;

public interface Handler {
    HandleResult handle(String input);

    String getName();

    String getWelcomeMessage();

    void printResult(OutputStream outputStream) throws IOException;

    void printWelcomeMessage(OutputStream outputStream) throws IOException;
}
