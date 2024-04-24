package eazytry.decision_maker.handler;

public abstract class NoIteractionsHandler extends BaseHandler {
    @Override
    protected boolean isStopWord(String input) {
        return true;
    }

    @Override
    protected void handleNextString(String input) {
        throw new UnsupportedOperationException("Не поддерживается");
    }
}
