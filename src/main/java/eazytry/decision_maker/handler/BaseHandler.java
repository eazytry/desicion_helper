package eazytry.decision_maker.handler;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public abstract class BaseHandler implements Handler {
    private static final String DEFAULT_STOP_WORD = "";
    private static final String DEFAULT_ERROR_MESSAGE = "Произошла внутренняя ошибка";

    private HandleResult currentResult;

    @Override
    public final HandleResult handle(String input) {
        if (!isStopWord(input)) {
            currentResult = new HandleResult(Status.CONTINUE);
            handleNextString(input);
            return currentResult;
        }
        currentResult = new HandleResult(Status.RETURN);
        return currentResult;
    }

    @Override
    public final void printResult(OutputStream outputStream) throws IOException {
        var writer = new OutputStreamWriter(outputStream);
        if (!hasResult()) {
            writer.write(DEFAULT_ERROR_MESSAGE + "\n\n");
            return;
        }
        writer.write(getResult() + "\n\n");
        writer.flush();
    }

    @Override
    public final void printWelcomeMessage(OutputStream outputStream) throws IOException {
        var writer = new OutputStreamWriter(outputStream);
        writer.write(getWelcomeMessage() + "\n");
        writer.flush();
    }

    private boolean hasResult() {
        return currentResult != null && currentResult.isFinished();
    }

    protected abstract String getResult();

    protected abstract void handleNextString(String input);

    protected boolean isStopWord(String input) {
        return DEFAULT_STOP_WORD.equals(input);
    }
}
